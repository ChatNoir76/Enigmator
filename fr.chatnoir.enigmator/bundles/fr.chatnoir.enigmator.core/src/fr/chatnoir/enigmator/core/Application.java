package fr.chatnoir.enigmator.core;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.core.arguments.ArgsProcessor;
import fr.chatnoir.enigmator.service.Service;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {

		// récupération de la liste des arguments
		List<String> args = Arrays.asList(Platform.getApplicationArgs());
		
		// interprétatSion des arguments
		ArgsProcessor processor = EnigmatorFactory.createArgsProcessor(args);
		
		if(!processor.isEmptyArg()) {
			
			if(processor.isErrorMessage()) {
				logger.error(processor.getErrorMessage());
			} else if(processor.isHelpInformation()) {
				this.helpScreen();
			} else if(processor.isArgDecrypt()) {
				logger.info("Résultats du décryptage:");
				System.out.println(Service.uncrypt(processor.getStringValue()));
			} else if(processor.isArgEncrypt()) {
				logger.info("Résultats du Cryptage:");
				System.out.println(Service.encrypt(processor.getStringValue()));
			} else {
				logger.warn("Pas d'action requise");
			}
			return IApplication.EXIT_OK;
		} else {
			logger.info("*** Application Enigmator ***");
			logger.info("essayer avec l'argument : --help");
			return IApplication.EXIT_OK;
		}

	}
	
	private void helpScreen() {
		String version;
		try {
			Version v = Platform.getProduct().getDefiningBundle().getVersion();
			version = v.toString();
		} catch(NullPointerException ex) {
			version = "Development application";
		}
		
		StringBuilder str = new StringBuilder("\nEnigmator [COMMANDE]\n\n");
		
		str.append("Caractères autorisés:[a-z] & [A-Z] & [0-9] & [_]\n\\n")
			.append("COMMANDE:\n")
			.append("-h / --help => Description des commandes\n")
			.append("-d:<valeur> / --decrypt:<valeur> => Décryptage de <valeur>\n")
			.append("-e:<valeur> / --encrypt:<valeur> => Cryptage de <valeur>\n\n")
			.append("EXEMPLE:\n")
			.append("Enigmator --help\n")
			.append("Enigmator -e:quelque_chose_a_crypter_sans_espace\n")
			.append("Enigmator --decrypt:GSdR-&]=XhEQdEyl[PnpJCqE/nfQTeIN`I}\n\n")
			.append("VERSION:\n")
			.append(version + "\n");
		System.out.println(str.toString());
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
