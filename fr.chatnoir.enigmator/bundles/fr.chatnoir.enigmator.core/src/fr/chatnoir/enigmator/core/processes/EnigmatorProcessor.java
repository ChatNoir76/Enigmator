package fr.chatnoir.enigmator.core.processes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public abstract class EnigmatorProcessor extends AbstractProcessor implements Runnable {

	private String source;
	protected String resultat;

	protected String getSource() {
		return source;
	}

	public EnigmatorProcessor(String processName, String source) {
		super(processName);
		LOGGER.info("process from terminal");
		if(source.isEmpty()) {
			LOGGER.error("no source to process");
		}else {
			this.source = source;
		}
	}
	
	public EnigmatorProcessor(String processName, File file) {
		super(processName);
		LOGGER.info("process from file");
		Optional<String> fileSource = ReadFile(file);
		fileSource.ifPresent(s -> {
			this.source = s;
		});
	}
	
	public String getResult() {
		return resultat;
	};
	
	private Optional<String> ReadFile(File file) {
		LOGGER.info("try to read the file");
	    // Créer l'objet File Reader
		if(file.isFile()) {
			try (FileReader fr = new FileReader(file)){
				try (BufferedReader br = new BufferedReader(fr)){
					// Créer l'objet BufferedReader    
					StringBuilder sb = new StringBuilder();    
					String line;
					while((line = br.readLine()) != null)
					{
						sb.append(line);      
						sb.append(" ");     
					}
					LOGGER.info("file was read with success");
					return Optional.ofNullable(sb.toString().trim());
				} catch (IOException e) {
					LOGGER.error("error during buffering file", e);
				}
			} catch (IOException e1) {
				LOGGER.error("error during reading the file", e1);
			}
		} else {
			LOGGER.error("file is missing : " + file.getPath());
		}
		return Optional.ofNullable(null);
	}

}
