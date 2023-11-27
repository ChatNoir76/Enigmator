package fr.chatnoir.enigmator.model.impl;

import java.util.ArrayList;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;

// This class overrides the generated class and will be instantiated by factory
public class EnigmatorImpl extends MEnigmatorImpl implements Enigmator
{
	
	/**
	 * Chain will made by disque
	 */
	private ArrayList<Integer> mixerChain;
	
	private ArrayList<Integer> createMixerChain(int number) throws EnigmatorException{
		ArrayList<Integer> mixerChain = new ArrayList<Integer>();
		//mixer chain generation
		if(this.getDisques().size()>0) {
			while(mixerChain.size() < number * 2) {
				this.getDisques().forEach(d -> {
					if(d.getChain().size()>0) {
						d.getChain().forEach(c -> {
							if(d.getIntervalle() != 0) {
								if(mixerChain.size()%d.getIntervalle() == 0) {
									mixerChain.add(Enigmator.saltAsInt);
								}
							}
							mixerChain.add(this.getNumber(c));
						});
					}
				});
				if(mixerChain.size() == 0) {
					throw new EnigmatorException("Enigmator configuration problem : can not generate mixer chain");
				}
			}
		}else {
			throw new EnigmatorException("Enigmator configuration problem : empty disk");
		}
		return mixerChain;
	}
	
	@Override
	public String execute(Operation operation, String source) throws EnigmatorException {
		
		StringBuilder s = new StringBuilder("");
		mixerChain = createMixerChain(source.length());
		
		//Traitement du texte
		char[] sourceAsArray = source.toCharArray();
		int salt = 0;
		for(int position = 0;position < sourceAsArray.length;position++) {
			char c = sourceAsArray[position];
			int ascii = this.getNumber(c);
			
			if(operation == Operation.CRYPTAGE) {
				if(mixerChain.get(position + salt) == Enigmator.saltAsInt) {
					int r = (int)(Math.random() * (Enigmator.table.size()));
					s.append(Enigmator.table.get(r));
					salt++;
				}
				Character c_convert = getCharacter(ascii, operation, position + salt);
				s.append(c_convert == null ? c : c_convert);
			} else if (operation == Operation.DECRYPTAGE) {
				if(mixerChain.get(position) != Enigmator.saltAsInt) {
					Character c_convert = getCharacter(ascii, operation, position);
					s.append(c_convert == null ? c : c_convert);
				} 
			}
			
			
			
		}
		return s.toString();
	}
	
	private Character getCharacter(int ascii, Operation operation, int position) {
		if(ascii != Enigmator.unknownAsInt) {
			ascii += mixerChain.get(position)*operation.getValue();
			while(ascii < 0) ascii += Enigmator.table.size();
			int enigma = ascii%Enigmator.table.size();
			return this.getChar(enigma);
		} else {
			return null;
		}
	}

}
