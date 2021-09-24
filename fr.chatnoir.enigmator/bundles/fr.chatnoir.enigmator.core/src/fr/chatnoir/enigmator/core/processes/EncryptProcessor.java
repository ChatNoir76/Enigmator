package fr.chatnoir.enigmator.core.processes;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.Operation;
import fr.chatnoir.enigmator.service.exception.EnigmatorException;
import fr.chatnoir.enigmator.service.exception.EnigmatorRuntimeException;

public class EncryptProcessor extends EnigmatorProcessor {

	protected static final Logger LOGGER = LoggerFactory.getLogger(EncryptProcessor.class);
	
	public EncryptProcessor(String source) {
		super("Encrypt", source);
	}
	
	public EncryptProcessor(File file) {
		super("Encrypt", file);
	}

	@Override
	public void run() {
		LOGGER.info("Cryptage");
		Enigmator e = ModelFactory.eINSTANCE.createFullEncodingEnigmator();
		try {
			resultat = e.execute(Operation.CRYPTAGE, this.getSource());
		} catch (EnigmatorException e1) {
			throw new EnigmatorRuntimeException("Erreur lors de l'opération de cryptage", e1);
		}
	}
}
