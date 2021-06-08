package fr.chatnoir.enigmator.core;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.core.arguments.ArgsProcessor;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {

		// récupération de la liste des arguments
		List<String> args = Arrays.asList(Platform.getApplicationArgs());
		
		// interprétation des arguments
		ArgsProcessor processor = EnigmatorFactory.createArgsProcessor(args);
		
		if(!processor.isEmptyArg()) {
			
			if(processor.isErrorMessage()) {
				logger.error(processor.getErrorMessage());
			} else if(processor.isHelpInformation()) {
				this.helpScreen();
			} else if(processor.isArgDecrypt()) {
				logger.info("Résultats du décryptage:");
			} else if(processor.isArgEncrypt()) {
				logger.info("Résultats du Cryptage:");
			} else {
				logger.warn("Résultats du Cryptage:");
			}
			
			logger.debug(processor.getStringValue());
			
			
			
			
			return IApplication.EXIT_OK;
		} else {
			logger.info("*** Application Enigmator ***");
			logger.info("essayer avec l'argument : --help");
			return IApplication.EXIT_OK;
		}

	}
	
	private void helpScreen() {
		
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
