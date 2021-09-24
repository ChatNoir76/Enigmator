package fr.chatnoir.enigmator.core.processes;

import java.io.File;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.operation;

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
		Enigmator e = ModelFactory.eINSTANCE.createEnigmator();
		e.setSource(this.getSource());
		e.setTypeOperation(operation.CRYPT);
		Optional<String> opt =  e.run();
		if(opt.isPresent()) {
			resultat = opt.get();
		}
	}
}
