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
				System.out.println(String.format("[%d] %s -> %s [%d]", ascii, sourceAsArray[position], c, enigma));
			}
			s.append(c);
		}

		return s.toString();
	}
	/**
[2][2][4][4] c -> e)		2
[14][7][21][21] o -> v)		14
[20][0][20][20] u -> u)		20
[2][19][21][21] c -> v)		2
[14][13][27][27] o -> 1)	14
[20][14][34][34] u -> 8)	20
[63][8][71][71] @ -> _)		63
[12][17][29][29] m -> 3)	12
[14][33][47][47] o -> L)	14
[13][32][45][45] n -> J)	13
[63][38][101][29] @ -> 3)	-9 *
[15][43][58][58] p -> W)	15
[4][36][40][40] e -> E)		4
[19][55][74][2] t -> c)		-53 *
[8][49][57][57] i -> V)		8
[19][50][69][69] t -> %)	19
[63][44][107][35] @ -> 9)	-9 *
	 */
}
