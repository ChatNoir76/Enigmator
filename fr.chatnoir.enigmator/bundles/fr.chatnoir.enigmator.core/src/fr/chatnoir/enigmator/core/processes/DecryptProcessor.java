package fr.chatnoir.enigmator.core.processes;

import java.io.File;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.EnigmatorException;

public class DecryptProcessor extends EnigmatorProcessor {
	
	public DecryptProcessor(String source) {
		super("Decrypt", source);
	}
	
	public DecryptProcessor(File file) {
		super("Decrypt", file);
	}

	@Override
	public void run() {
		LOGGER.info("decrypt in progress...");
		Enigmator e = ModelFactory.eINSTANCE.createFullEncodingEnigmator();
		try {
			resultat = e.execute(Operation.DECRYPTAGE, this.getSource());
		} catch (EnigmatorException e1) {
			LOGGER.error("error during decrypting", e1);
		}
	}
}
