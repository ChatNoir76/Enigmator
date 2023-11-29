package fr.chatnoir.enigmator.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.SystemUtils;
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
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		CommandLine cmd = new CommandLine(new EnigmatorRunner());
		int exitCode = cmd.execute(Platform.getApplicationArgs()); 
		if(exitCode != 0) {
			throw new EnigmatorRuntimeException("Error during Enigmator application due to exit code different from 0");
		}
		if(SystemUtils.IS_OS_WINDOWS) {
			System.out.print("press a key to terminate\n");
			try {
				new BufferedReader(new InputStreamReader (System.in)).readLine();
			} catch (IOException e) {}
		}
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}
}
