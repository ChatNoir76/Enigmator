package fr.chatnoir.enigmator.core.processes;

import java.io.File;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.operation;

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
		Enigmator e = ModelFactory.eINSTANCE.createEnigmator();
		e.setSource(this.getSource());
		e.setTypeOperation(operation.UNCRYPT);
		Optional<String> opt =  e.run();
		if(opt.isPresent()) {
			resultat = opt.get();
		}
	}
}
