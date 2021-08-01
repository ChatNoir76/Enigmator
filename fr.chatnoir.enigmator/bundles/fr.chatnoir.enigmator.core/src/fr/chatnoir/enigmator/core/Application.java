package fr.chatnoir.enigmator.core;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
	private String version;
	
	@Override
	public Object start(IApplicationContext context) throws Exception {

		if(getVersion().isPresent()) {
			version = getVersion().get().toString();
		}else {
			version = "Development application";
		}
		
		logger.info("*** Lancement de Enigmator v" + version + " ***");
		
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
				logger.info("Opération : Décryptage de " + processor.getStringValue());
				logger.info("Résultats du décryptage:");
				logger.info(Service.uncrypt(processor.getStringValue()));
			} else if(processor.isArgEncrypt()) {
				logger.info("Opération : Cryptage de " + processor.getStringValue());
				logger.info("Résultats du Cryptage:");
				logger.info(Service.encrypt(processor.getStringValue()));
			} else {
				logger.warn("Pas d'action requise");
			}
		} else {
			logger.info("essayer avec l'argument : --help");
		}
		logger.info("*** fin de l'opération ***");
		return IApplication.EXIT_OK;
	}
	/**
	 * Visualisation de l'aide
	 */
	private void helpScreen() {
		
		StringBuilder str = new StringBuilder("Activation de la command Help...\nEnigmator [COMMANDE]\n\n");
		
		str.append("Caractères autorisés:[a-z] & [A-Z] & [0-9] & [_]\n\n")
			.append("COMMANDE: (résultat dans le répertoire logger)\n")
			.append("-h / --help => Description des commandes\n")
			.append("-d:<valeur> / --decrypt:<valeur> => Décryptage de <valeur>\n")
			.append("-e:<valeur> / --encrypt:<valeur> => Cryptage de <valeur>\n\n")
			.append("EXEMPLE:\n")
			.append("Enigmator --help\n")
			.append("Enigmator -e:quelque_chose_a_crypter_sans_espace\n")
			.append("Enigmator --decrypt:GSdR-&]=XhEQdEyl[PnpJCqE/nfQTeIN`I}\n\n")
			.append("VERSION:\n")
			.append(version + "\n");
		logger.info(str.toString());
	}
	/**
	 * Récupère la version de l'application
	 * @return La version du la feature / plugin
	 */
	private Optional<Version> getVersion() {
		try {
			Version v = Platform.getProduct().getDefiningBundle().getVersion();
			return Optional.ofNullable(v);
		} catch(NullPointerException ex) {
			return Optional.ofNullable(null);
		}
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
