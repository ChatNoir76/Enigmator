package fr.chatnoir.enigmator.response.method;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResponseFileManager implements IResponseManager {

	private static final Logger LOGGER = LogManager.getLogger(ResponseFileManager.class);
	
	private String filePath;
	
	public ResponseFileManager(String filePath) {
		this.filePath = filePath;
	}

	@Override 
	public void sendResponse(String information) {
		
		try {
			FileUtils.write(new File(filePath), information, StandardCharsets.UTF_8);
		} catch (IOException e) {
			LOGGER.error("write error", e);
		}
		
	}

}
