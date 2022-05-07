package fr.chatnoir.enigmator.core;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.core.arguments.ArgsProcessor;
import fr.chatnoir.enigmator.core.arguments.ArgsType;
import fr.chatnoir.enigmator.core.processes.AbstractProcessor;
import fr.chatnoir.enigmator.response.Response;
import fr.chatnoir.enigmator.response.Responser;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		LOGGER.info("starting application");
		// récupération de la liste des arguments
		List<String> args = Arrays.asList(Platform.getApplicationArgs());
		ArgsProcessor arguments = new ArgsProcessor(args);
		ArgsType t = arguments.getType();
		String s = arguments.getArg();
		AbstractProcessor process = null;
		switch(t) {
			case Decrypt:
				Responser.eInstance().setAsConsole();
				process = EnigmatorFactory.getDecryptProcess(s);
				break;
			case Encrypt:
				Responser.eInstance().setAsConsole();
				process = EnigmatorFactory.getEncryptProcess(s);
				break;
			case EncryptFromFile:
				Responser.eInstance().setAsFile(s);
				process = EnigmatorFactory.getFileEncryptProcess(new File(s));
				break;
			case DecryptFromFile:
				Responser.eInstance().setAsFile(s);
				process = EnigmatorFactory.getFileDecryptProcess(new File(s));
				break;
			case HelpInformation:
				Responser.eInstance().setAsConsole();
				process = EnigmatorFactory.getHelpProcess();
				break;
			default:
				break;	
		}
		if(process != null) {
			process.run();
			Response.eInstance().sendResponse(process.getResult());
		} else {
			LOGGER.error("Wrong Arguments, try --help");
		}
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}
}
