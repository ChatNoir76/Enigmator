package fr.chatnoir.enigmator.core.processes;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.apache.commons.io.FileUtils;

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

		try {
			return Optional.ofNullable(FileUtils.readFileToString(file, StandardCharsets.UTF_8));
		} catch (IOException e) {
			LOGGER.error("Read file error", e);
			return Optional.ofNullable(null);
		}
		
	}

}
