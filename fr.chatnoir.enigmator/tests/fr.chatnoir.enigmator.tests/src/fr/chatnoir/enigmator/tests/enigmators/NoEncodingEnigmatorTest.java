package fr.chatnoir.enigmator.tests.enigmators;

import org.junit.jupiter.api.Test;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.tests.AbstractEnigmatorTest;

public class NoEncodingEnigmatorTest extends AbstractEnigmatorTest {

	private static final String longString = "azertyuiopqsdfghjklmwxcvbn";
	
	@Override
	protected Enigmator createEnigmator() {
		return ModelFactory.eINSTANCE.createNoEncodingEnigmator();
	}
	
	@Test
	void simpleString() throws EnigmatorException {
		testEnigmator(longString);
	}
	
	@Test
	void fullString() throws EnigmatorException {
		testEnigmator(getFullString());
	}

}
