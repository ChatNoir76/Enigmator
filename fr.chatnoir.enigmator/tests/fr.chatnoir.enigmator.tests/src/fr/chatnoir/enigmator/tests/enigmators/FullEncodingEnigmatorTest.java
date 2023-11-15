package fr.chatnoir.enigmator.tests.enigmators;

import org.junit.jupiter.api.Test;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.tests.AbstractEnigmatorTest;


public class FullEncodingEnigmatorTest extends AbstractEnigmatorTest {

	private static final String longString = "azertyuiopqsdfghjklmwxcvbn";
	
	@Override
	protected Enigmator createEnigmator() {
		return ModelFactory.eINSTANCE.createFullEncodingEnigmator();
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
