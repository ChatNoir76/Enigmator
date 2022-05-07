package fr.chatnoir.enigmator.core.processes;

import java.util.Optional;

import org.osgi.framework.Version;

import fr.chatnoir.enigmator.service.Service;

public class HelpProcessor extends AbstractProcessor {
	
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
			LOGGER.warn("No application version found");
			version = "none";
		}
	}

	@Override
	public String getResult() {
		LOGGER.info("openning help menu");
		StringBuilder str = new StringBuilder("Help menu activation...\n\nUsage:\n\nEnigmator <command>\n\n");
		
		str.append("[command]\n")
			.append("short command name\n\n")
			.append("-h\tthis help menu\n")
			.append("-e:<value to decrypt>\tencrypt the text in argument\n")
			.append("-d:<value to decrypt>\tdecrypt the text in argument\n")
			.append("-fe:<path_to_file>\tencrypt the file contents\n")
			.append("-fd:<path_to_file>\tdecrypt the file contents\n")
			.append("\n").append("long command name\n\n")
			.append("--help\tthis help menu\n")
			.append("--encrypt:<value to decrypt>\tencrypt the text in argument\n")
			.append("--decrypt:<value to decrypt>\tdecrypt the text in argument\n")
			.append("--fileencrypt:<path_to_file>\tencrypt the file contents\n")
			.append("--filedecrypt:<path_to_file>\tdecrypt the file contents\n")
			.append("\n\n\tEXAMPLE:\n")
			.append("\tEnigmator --help\n")
			.append("\tEnigmator -e:write something here\n")
			.append("\tEnigmator --decrypt:GSdR-&]=XhEQdEyl[PnpJCqE/nfQTeIN`I}\n\n")
			.append("VERSION:\n\t")
			.append(version + "\n");
		return str.toString();
	}

}
