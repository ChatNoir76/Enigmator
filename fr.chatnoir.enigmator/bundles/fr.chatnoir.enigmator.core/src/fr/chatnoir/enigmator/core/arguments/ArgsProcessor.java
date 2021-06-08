package fr.chatnoir.enigmator.core.arguments;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.service.EnigmatorException;

/**
 * Classe de classement des arguments de l'application
 * @author chatnoir
 *
 */
public class ArgsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(ArgsProcessor.class);
	
	private final static String SEPARATOR = ":";
	
	private final static String[] ARG_DECRYPT = {"-d" + SEPARATOR, "--decrypt" + SEPARATOR};
	private final static String[] ARG_ENCRYPT = {"-e" + SEPARATOR, "--encrypt" + SEPARATOR};
	private final static String[] ARG_HELP = {"-h", "--help"};
	
	private boolean helpInformation;
	private boolean argDecrypt;
	private boolean argEncrypt;
	private boolean emptyArg;
	
	private String stringValue;
	private String errorMessage;
	
	public boolean isHelpInformation() {
		return helpInformation;
	}

	public boolean isArgDecrypt() {
		return argDecrypt;
	}

	public boolean isArgEncrypt() {
		return argEncrypt;
	}

	public String getStringValue() {
		return stringValue;
	}
	
	public boolean isErrorMessage() {
		return errorMessage != null;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public boolean isEmptyArg() {
		return emptyArg;
	}

	public ArgsProcessor(List<String> args) {
		
		if(!args.isEmpty()) {
			args.forEach(arg -> {
				try {
					getArgumentType(arg);
				} catch (EnigmatorException e) {
					this.errorMessage = e.getMessage();
				}
			});
		} else {
			logger.debug("il n'y a pas d'argument");
			this.emptyArg = true;
		}
	}
	
	private void getArgumentType(String arg) throws EnigmatorException{
		
		if(arg.startsWith(ARG_DECRYPT[0]) || arg.startsWith(ARG_DECRYPT[1])) {
			
			logger.debug("argument de décryptage : " + arg);
			if(!argEncrypt) {
				stringValue = extractStringValue(arg);
				argDecrypt = true;
			} else {
				logger.warn("Argument de décryptage ignoré : " + arg);
			}
			
		} else if(arg.startsWith(ARG_ENCRYPT[0]) || arg.startsWith(ARG_ENCRYPT[1])) {
			
			logger.debug("argument de cryptage : " + arg);
			if(!argDecrypt) {
				stringValue = extractStringValue(arg);
				argEncrypt = true;
			} else {
				logger.warn("Argument de cryptage ignoré : " + arg);
			}
			
			
		} else if(arg.startsWith(ARG_HELP[0]) || arg.startsWith(ARG_HELP[1])) {
			
			logger.debug("Argument Help : " + arg);
			this.helpInformation = true;
			
		} else {
			logger.warn("Argument inconnu : " + arg);
		}	
	}
	
	private String extractStringValue(String arg) throws EnigmatorException {
		
		if(arg.contains(SEPARATOR)) {
			return arg.split(SEPARATOR, 2)[1];
		} else {
			throw new EnigmatorException("Erreur lors du traitement de l'argument : " + arg);
		}	
		
	}
	
}
