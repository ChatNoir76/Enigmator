package fr.chatnoir.enigmator.core.processes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractProcessor implements Runnable {

	protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractProcessor.class);
	
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
