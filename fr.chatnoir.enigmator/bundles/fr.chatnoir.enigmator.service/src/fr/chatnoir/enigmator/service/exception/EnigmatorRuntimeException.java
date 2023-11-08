package fr.chatnoir.enigmator.service.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnigmatorRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LogManager.getLogger(EnigmatorRuntimeException.class);

	public EnigmatorRuntimeException(String message, Throwable cause) {
		super(message, cause);
		LOGGER.error(message, cause);
	}

	public EnigmatorRuntimeException(String message) {
		super(message);
		LOGGER.error(message);
	}

}
