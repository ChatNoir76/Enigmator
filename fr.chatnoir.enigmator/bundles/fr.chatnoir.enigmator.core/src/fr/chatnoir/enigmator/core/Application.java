package fr.chatnoir.enigmator.core;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import fr.chatnoir.enigmator.core.arguments.ArgsProcessor;
import fr.chatnoir.enigmator.core.processes.AbstractProcessor;
import fr.chatnoir.enigmator.response.Response;
import fr.chatnoir.enigmator.response.Responser;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		// récupération de la liste des arguments
		List<String> args = Arrays.asList(Platform.getApplicationArgs());
		ArgsProcessor arguments = new ArgsProcessor(args);
		arguments.getListe().forEach((t,s) -> {
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
			}
		});
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}
}
