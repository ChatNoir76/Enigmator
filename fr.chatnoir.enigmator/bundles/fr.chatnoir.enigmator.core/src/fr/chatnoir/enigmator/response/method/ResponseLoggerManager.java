package fr.chatnoir.enigmator.response.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseLoggerManager implements IResponseManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResponseLoggerManager.class);
	
	@Override
	public void sendResponse(String information) {
		LOGGER.info(information);
	}

}
