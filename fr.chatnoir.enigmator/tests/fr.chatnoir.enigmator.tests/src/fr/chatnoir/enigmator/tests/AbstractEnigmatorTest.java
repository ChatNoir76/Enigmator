package fr.chatnoir.enigmator.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;

public abstract class AbstractEnigmatorTest {

	private Enigmator enigmator;
	
	private int iterationMax;
	private Set<Character> autorizedCharacter;
	
	public int getIterationMax() {
		return iterationMax;
	}

	public Set<Character> getAutorizedCharacter() {
		return autorizedCharacter;
	}
	
	public String getFullString() {
		StringBuilder str = new StringBuilder();
		
		while(str.length()<iterationMax) {
			autorizedCharacter.stream().forEach(c -> {
				str.append(c);
			});
		}
		
		return str.toString();
		
	}
	
	@BeforeEach
	void setEnigmator() {
		enigmator = createEnigmator();
	}
	
	@BeforeEach
	void setDisqueInfo() {
		iterationMax = 1;
		autorizedCharacter = new HashSet<Character>();
		enigmator.getDisques().forEach(disque -> {
			disque.getChain().forEach(character -> {
				autorizedCharacter.add(character);
			});
			iterationMax *= disque.getChain().size();
		});
	}
	
	protected abstract Enigmator createEnigmator();
	
	protected void testEnigmator(String chain) throws EnigmatorException {
		String step =  enigmator.execute(Operation.CRYPTAGE, chain);
		String result = enigmator.execute(Operation.DECRYPTAGE, step);
		assertEquals(chain, result);
	}
	
}
