package fr.chatnoir.enigmator.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnigmatorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915114707565207125L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EnigmatorException.class);

	public EnigmatorException(String message) {
		super(message);
		LOGGER.error(message);
	}

	public EnigmatorException(String message, Throwable cause) {
		super(message, cause);
		LOGGER.error(message, cause);
	}

}
