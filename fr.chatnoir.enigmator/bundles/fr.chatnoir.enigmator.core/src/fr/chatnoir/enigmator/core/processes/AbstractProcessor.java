package fr.chatnoir.enigmator.core.processes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractProcessor implements Runnable {

	protected static final Logger LOGGER = LogManager.getLogger(AbstractProcessor.class);
	
	private String processName;
	
	public String getProcessName() {
		return processName;
	}
	
	public AbstractProcessor(String processName) {
		this.processName = processName;
	}

	@Override
	public abstract void run();

	public abstract String getResult();
}
