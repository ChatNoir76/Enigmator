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
		this.source = source;
	}
	
	public EnigmatorProcessor(String processName, File file) {
		super(processName);
		Optional<String> fileSource = ReadFile(file);
		fileSource.ifPresent(s -> {
			this.source = s;
		});
	}

	@Override
	public abstract void run();
	
	public String getResult() {
		return resultat;
	};
	
	private Optional<String> ReadFile(File file) {

	    // Créer l'objet File Reader
		if(file.isFile()) {
			try (FileReader fr = new FileReader(file)){
				try (BufferedReader br = new BufferedReader(fr)){
					// Créer l'objet BufferedReader    
					StringBuilder sb = new StringBuilder();    
					String line;
					while((line = br.readLine()) != null)
					{
					    // ajoute la ligne au buffer
						sb.append(line);      
						sb.append(" ");     
					}
					return Optional.ofNullable(sb.toString());
				} catch (IOException e) {
					LOGGER.error("Erreur lors de la mise en cache du fichier", e);
				}
			} catch (IOException e1) {
				LOGGER.error("Erreur lors de la lecture du fichier", e1);
			}
		} else {
			LOGGER.error("Le fichier n'existe pas : " + file.getPath());
		}
		return Optional.ofNullable(null);
	}

}
