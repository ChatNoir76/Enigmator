package fr.chatnoir.enigmator.core.processes;

import java.util.Optional;

import org.osgi.framework.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.service.Service;

public class HelpProcessor extends AbstractProcessor {

	protected static final Logger LOGGER = LoggerFactory.getLogger(HelpProcessor.class);
	
	private String version;
	
	public HelpProcessor() {
		super("Help");
	}

	@Override
	public void run() {
		LOGGER.trace("running processor");
		Optional<Version> ver = Service.getVersion();
		
		if(ver.isPresent()) {
			version = ver.get().toString();
		}else {
			version = "Development application";
		}
	}

	@Override
	public String getResult() {
		StringBuilder str = new StringBuilder("Activation de la command Help...\nEnigmator [COMMANDE]\n\n");
		
		str.append("Caractères autorisés:[a-zA-Z0-9] & [_]\n\n")
			.append("COMMANDE: (résultat dans le répertoire logger)\n")
			.append("-h / --help => Description des commandes\n")
			.append("-d:<valeur> / --decrypt:<valeur> => Décryptage de <valeur>\n")
			.append("-e:<valeur> / --encrypt:<valeur> => Cryptage de <valeur>\n")
			.append("-fd:<valeur> / --filedecrypt:<chemin_fichier> => Décryptage du fichier\n")
			.append("-fe:<valeur> / --fileencrypt:<chemin_fichier> => Cryptage du fichier\n\n")
			.append("EXEMPLE:\n")
			.append("Enigmator --help\n")
			.append("Enigmator -e:quelque_chose_a_crypter_sans_espace\n")
			.append("Enigmator --decrypt:GSdR-&]=XhEQdEyl[PnpJCqE/nfQTeIN`I}\n\n")
			.append("VERSION:\n")
			.append(version + "\n");
		return str.toString();
	}

}
