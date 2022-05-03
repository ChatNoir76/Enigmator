package fr.chatnoir.enigmator.core.arguments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe de création de processus en fonction des arguments de l'application
 * @author chatnoir
 *
 */
public class ArgsProcessor {
	
	private final static String[] ARG_DECRYPT = {"-d:", "--decrypt:"};
	private final static String[] ARG_DECRYPT_FILE = {"-fd:", "--filedecrypt:"};
	private final static String[] ARG_ENCRYPT = {"-e:", "--encrypt:"};
	private final static String[] ARG_ENCRYPT_FILE = {"-fe:", "--fileencrypt:"};
	private final static String[] ARG_HELP = {"-h", "--help"};

	private Map<ArgsType, String[]> liste;
	private ArgsType type;
	private String arg;
	
	public ArgsType getType() {
		return type;
	}

	public String getArg() {
		return arg;
	}
	
	private void init() {
		this.type = ArgsType.None;
		this.arg = null;
		this.liste = new HashMap<ArgsType, String[]>();
		liste.put(ArgsType.Decrypt, ARG_DECRYPT);
		liste.put(ArgsType.DecryptFromFile, ARG_DECRYPT_FILE);
		liste.put(ArgsType.Encrypt, ARG_ENCRYPT);
		liste.put(ArgsType.EncryptFromFile, ARG_ENCRYPT_FILE);
		liste.put(ArgsType.HelpInformation, ARG_HELP);
	}

	public ArgsProcessor(List<String> args) {
		this.init();
		
		if(!args.isEmpty()) {
			StringBuilder arg = new StringBuilder();
			args.forEach(s -> arg.append(s).append(" "));
			arg.deleteCharAt(arg.length()-1);
			
			liste.forEach((key, values) -> {
				for(String value: values) {
					if(arg.toString().startsWith(value)) {
						this.type = key;
						this.arg  = arg.substring(value.length());
					}
				}
			});
		} 
	}
	
}















