package fr.chatnoir.enigmator.core.arguments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Classe de création de processus en fonction des arguments de l'application
 * @author chatnoir
 *
 */
public class ArgsProcessor {

	private final static char ARG_SEPARATOR = ':';
	private final static char ARG_START = '-';
	
	private final static String[] ARG_DECRYPT = {"d", "decrypt"};
	private final static String[] ARG_DECRYPT_FILE = {"fd", "filedecrypt"};
	private final static String[] ARG_ENCRYPT = {"e", "encrypt"};
	private final static String[] ARG_ENCRYPT_FILE = {"fe", "fileencrypt"};
	private final static String[] ARG_HELP = {"h", "help"};
	
	private ArrayList<String> decrypt = new ArrayList<String>();
	private ArrayList<String> encrypt = new ArrayList<String>();
	private ArrayList<String> filedecrypt = new ArrayList<String>();
	private ArrayList<String> fileencrypt = new ArrayList<String>();
	private ArrayList<String> help = new ArrayList<String>();

	private Map<ArgsType, String> liste;
	
	public Map<ArgsType, String> getListe() {
		return liste;
	}
	
	private void initialize() {
		decrypt.addAll(Arrays.asList(ARG_DECRYPT));
		encrypt.addAll(Arrays.asList(ARG_ENCRYPT));
		help.addAll(Arrays.asList(ARG_HELP));
		filedecrypt.addAll(Arrays.asList(ARG_DECRYPT_FILE));
		fileencrypt.addAll(Arrays.asList(ARG_ENCRYPT_FILE));
	}

	public ArgsProcessor(List<String> args) {
		liste = new HashMap<ArgsType, String>();
		this.initialize();
		
		StringBuilder Delimiter = new StringBuilder();
		Delimiter.append(ARG_SEPARATOR);
		Delimiter.append(ARG_START);
				
		if(!args.isEmpty()) {
			args.forEach(argument -> {
				//traitement des arguments
				StringTokenizer strTok = new StringTokenizer(argument, Delimiter.toString());
				int iterator = strTok.countTokens();
				//initialisation des variables
				ArgsType type = ArgsType.None;
				String key = null;
				String value = null;
				
				if(iterator == 2) {
					key = strTok.nextToken();
					value = strTok.nextToken();
					
					if(decrypt.contains(key)) {
						type = ArgsType.Decrypt;
					} else if(encrypt.contains(key)) {
						type = ArgsType.Encrypt;
					} else if(filedecrypt.contains(key)) {
						type = ArgsType.DecryptFromFile;
					} else if(fileencrypt.contains(key)) {
						type = ArgsType.EncryptFromFile;
					}
												
				} else if(iterator == 1) {
					key = strTok.nextToken();
					if(help.contains(key)) {
						type = ArgsType.HelpInformation;
					}
				}
				liste.put(type, value);
			});
		} 
	}
	
}















