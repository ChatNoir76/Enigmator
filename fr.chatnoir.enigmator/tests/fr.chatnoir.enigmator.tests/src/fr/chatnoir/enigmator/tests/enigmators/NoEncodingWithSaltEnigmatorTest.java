package fr.chatnoir.enigmator.tests.enigmators;

import org.junit.jupiter.api.Test;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.tests.AbstractEnigmatorTest;

public class NoEncodingWithSaltEnigmatorTest extends AbstractEnigmatorTest {

	private static final String aString = "AAAAAAAAAA";
	
	@Override
	protected Enigmator createEnigmator() {
		
		return ModelFactory.eINSTANCE.createNoEncodingWithSaltEnigmator();
	}
	
	@Test
	void simpleString() throws EnigmatorException {
		testEnigmator(aString);
	}
	
	@Test
	void saltString() throws EnigmatorException {
		testSaltAlgorithm(aString);
	}

}
