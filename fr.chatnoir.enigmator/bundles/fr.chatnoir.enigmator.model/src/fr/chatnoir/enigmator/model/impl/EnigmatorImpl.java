package fr.chatnoir.enigmator.model.impl;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;

// This class overrides the generated class and will be instantiated by factory
public class EnigmatorImpl extends MEnigmatorImpl implements Enigmator
{
	
	private static final Logger LOGGER = LogManager.getLogger(EnigmatorImpl.class);
	
	/**
	 * Chain will made by disque
	 */
	private ArrayList<Integer> mixerChain;
	
	@Override
	public String execute(Operation operation, String source) throws EnigmatorException {
		StringBuilder s = new StringBuilder("");
		mixerChain = new ArrayList<Integer>();
		
		//mixer chain generation
		if(this.getDisques().size()>0) {
			while(mixerChain.size() < source.length()) {
				this.getDisques().forEach(d -> {
					if(d.getChain().size()>0) {
						d.getChain().forEach(c -> {
							mixerChain.add(this.getNumber(c));
							//TODO add intervalle arg
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
		
		//Traitement du texte
		char[] sourceAsArray = source.toCharArray();
		for(int position = 0;position < sourceAsArray.length;position++) {
			int ascii = this.getNumber(sourceAsArray[position]);
			char c = Enigmator.unknownAsChar;
			if(ascii != Enigmator.unknownAsInt) {
				ascii += mixerChain.get(position)*operation.getValue();
				while(ascii < 0) ascii += Enigmator.table.size();
				int enigma = ascii%Enigmator.table.size();
				c = this.getChar(enigma);
				LOGGER.trace(String.format("[%d] %s -> %s [%d]", ascii, sourceAsArray[position], c, enigma));
			}
			s.append(c);
		}

		return s.toString();
	}

}
