package fr.chatnoir.enigmator.core.processes;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.osgi.framework.Version;

import fr.chatnoir.enigmator.service.Service;

public class HelpProcessor extends AbstractProcessor {

	protected static final Logger LOGGER = LogManager.getLogger(HelpProcessor.class);
	
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
		
		str.append("Caract�res autoris�s:[a-zA-Z0-9] & [_]\n\n")
			.append("COMMANDE: (r�sultat dans le r�pertoire logger)\n")
			.append("-h / --help => Description des commandes\n")
			.append("-d:<valeur> / --decrypt:<valeur> => D�cryptage de <valeur>\n")
			.append("-e:<valeur> / --encrypt:<valeur> => Cryptage de <valeur>\n")
			.append("-fd:<valeur> / --filedecrypt:<chemin_fichier> => D�cryptage du fichier\n")
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
