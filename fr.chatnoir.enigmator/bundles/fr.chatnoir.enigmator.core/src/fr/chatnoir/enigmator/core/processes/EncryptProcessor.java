package fr.chatnoir.enigmator.core.processes;

import java.io.File;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.EnigmatorException;

public class EncryptProcessor extends EnigmatorProcessor {
	
	public EncryptProcessor(String source) {
		super("Encrypt", source);
	}
	
	public EncryptProcessor(File file) {
		super("Encrypt", file);
	}

	@Override
	public void run() {
		LOGGER.info("Encrypt in progress...");
		Enigmator e = ModelFactory.eINSTANCE.createFullEncodingEnigmator();
		try {
			resultat = e.execute(Operation.CRYPTAGE, this.getSource());
		} catch (EnigmatorException e1) {
			LOGGER.error("Erreur lors de l'opération de cryptage", e1);
		}
	}
}
