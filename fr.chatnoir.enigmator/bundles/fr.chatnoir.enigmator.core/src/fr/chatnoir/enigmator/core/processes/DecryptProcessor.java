package fr.chatnoir.enigmator.core.processes;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.service.exception.EnigmatorRuntimeException;

public class DecryptProcessor extends EnigmatorProcessor {

	protected static final Logger LOGGER = LoggerFactory.getLogger(DecryptProcessor.class);
	
	public DecryptProcessor(String source) {
		super("Decrypt", source);
	}
	
	public DecryptProcessor(File file) {
		super("Decrypt", file);
	}

	@Override
	public void run() {
		LOGGER.info("Décryptage");
		Enigmator e = ModelFactory.eINSTANCE.createFullEncodingEnigmator();
		try {
			resultat = e.execute(Operation.DECRYPTAGE, this.getSource());
		} catch (EnigmatorException e1) {
			throw new EnigmatorRuntimeException("Erreur lors de l'opération de décryptage", e1);
		}
	}
}
