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
		int exitCode = new CommandLine(new EnigmatorRunner()).execute(Platform.getApplicationArgs()); 
		if(exitCode != 0) {
			throw new EnigmatorRuntimeException("Error during Enigmator application due to exit code different from 0");
		}
		
		// r�cup�ration de la liste des arguments
//		List<String> args = Arrays.asList(Platform.getApplicationArgs());
//		ArgsProcessor arguments = new ArgsProcessor(args);
//		arguments.getListe().forEach((t,s) -> {
//			AbstractProcessor process = null;
//			switch(t) {
//			case Decrypt:
//				Responser.eInstance().setAsConsole();
//				process = EnigmatorFactory.getDecryptProcess(s);
//				break;
//			case Encrypt:
//				Responser.eInstance().setAsConsole();
//				process = EnigmatorFactory.getEncryptProcess(s);
//				break;
//			case EncryptFromFile:
//				Responser.eInstance().setAsFile(s);
//				process = EnigmatorFactory.getFileEncryptProcess(new File(s));
//				break;
//			case DecryptFromFile:
//				Responser.eInstance().setAsFile(s);
//				process = EnigmatorFactory.getFileDecryptProcess(new File(s));
//				break;
//			case HelpInformation:
//				Responser.eInstance().setAsConsole();
//				process = EnigmatorFactory.getHelpProcess();
//				break;
//			default:
//				break;	
//			}
//			if(process != null) {
//				process.run();
//				Response.eInstance().sendResponse(process.getResult());
//			}
//		});
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}
}
