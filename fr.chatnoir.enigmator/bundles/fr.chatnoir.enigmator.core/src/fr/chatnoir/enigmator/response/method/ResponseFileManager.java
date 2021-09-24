package fr.chatnoir.enigmator.response.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseFileManager implements IResponseManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResponseFileManager.class);
	
	private String filePath;
	
	public ResponseFileManager(String filePath) {
		this.filePath = filePath;
	}

	@Override 
	public void sendResponse(String information) {
		try(FileWriter lu = new FileWriter(filePath)){
			BufferedWriter out = new BufferedWriter(lu);
			out.write(information);
			out.close();
		} catch (IOException e) {
			LOGGER.error("Erreur lors de l'écriture du fichier", e);
		}

	}

}
