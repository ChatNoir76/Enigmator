package fr.chatnoir.enigmator.response.method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResponseLoggerManager implements IResponseManager {

	private static final Logger LOGGER = LogManager.getLogger(ResponseLoggerManager.class);
	
	@Override
	public void sendResponse(String information) {
		LOGGER.info(information);
	}

}
