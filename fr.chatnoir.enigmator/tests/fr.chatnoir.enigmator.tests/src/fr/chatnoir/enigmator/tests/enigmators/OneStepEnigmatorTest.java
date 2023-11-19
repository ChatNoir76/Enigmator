package fr.chatnoir.enigmator.tests.enigmators;

import org.junit.jupiter.api.Test;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.tests.AbstractEnigmatorTest;

public class OneStepEnigmatorTest extends AbstractEnigmatorTest {

	@Override
	protected Enigmator createEnigmator() {
		return ModelFactory.eINSTANCE.createStepOneEnigmator();
	}

	@Test
	void simpleString() throws EnigmatorException {
		testEnigmator(longString);
	}

	@Test
	void fullString() throws EnigmatorException {
		testEnigmator(getFullString());
	}
	
	@Test
	void multilineString() throws EnigmatorException {
		testEnigmator(multilineString);
	}
	
	@Test
	void complexString() throws EnigmatorException {
		testEnigmator(complexString);
	}
	
	@Test
	void multilineSpaceString() throws EnigmatorException {
		testEnigmator(multilineStringWithSpace);
	}
	
	@Test
	void simpleSpaceString() throws EnigmatorException {
		testEnigmator(longStringWithSpace);
	}
	
}
