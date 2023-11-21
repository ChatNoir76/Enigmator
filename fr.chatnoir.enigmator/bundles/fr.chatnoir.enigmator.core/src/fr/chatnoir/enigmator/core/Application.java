package fr.chatnoir.enigmator.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import fr.chatnoir.enigmator.core.picocli.EnigmatorRunner;
import fr.chatnoir.enigmator.service.exception.EnigmatorRuntimeException;
import picocli.CommandLine;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		LOGGER.debug("Enigmator process start");
		
		CommandLine cmd = new CommandLine(new EnigmatorRunner());
		int exitCode = cmd.execute(Platform.getApplicationArgs()); 
		if(exitCode != 0) {
			throw new EnigmatorRuntimeException("Error during Enigmator application due to exit code different from 0");
		}

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}
}
