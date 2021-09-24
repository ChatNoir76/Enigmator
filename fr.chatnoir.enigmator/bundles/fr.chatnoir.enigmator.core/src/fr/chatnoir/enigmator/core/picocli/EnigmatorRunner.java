package fr.chatnoir.enigmator.core.picocli;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.chatnoir.enigmator.core.EnigmatorFactory;
import fr.chatnoir.enigmator.core.processes.AbstractProcessor;
import fr.chatnoir.enigmator.response.Response;
import fr.chatnoir.enigmator.response.Responser;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "Enigmator", versionProvider = fr.chatnoir.enigmator.core.picocli.EnigmatorVersionProvider.class, mixinStandardHelpOptions = true)
public class EnigmatorRunner implements Runnable {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EnigmatorRunner.class);

	@Option(names = { "-d", "--decrypt" }, description = "Décryptage de la chaine de caractère") 
    String[] decrypt;
	
	@Option(names = { "-e", "--encrypt" }, description = "Cryptage de la chaine de caractère") 
	String[] encrypt;
	
	@Option(names = { "-fd", "--filedecrypt" }, description = "Chemin absolu du fichier à décrypter") 
	String[] fDecrypt;
	
	@Option(names = { "fe", "--fileencrypt" }, description = "Chemin absolu du fichier à Crypter") 
	String[] fEncrypt;
	
	@Override
	public void run() {
		Responser.eInstance().setAsConsole();
		for(String str : decrypt) {
			LOGGER.info(str);
			runProcess(EnigmatorFactory.getDecryptProcess(str));
		}
		for(String str : encrypt) {
			LOGGER.info(str);
			runProcess(EnigmatorFactory.getEncryptProcess(str));
		}
		for(String str : fDecrypt) {
			LOGGER.info(str);
			Responser.eInstance().setAsFile(str);
			runProcess(EnigmatorFactory.getFileDecryptProcess(new File(str)));
		}
		for(String str : fEncrypt) {
			LOGGER.info(str);
			Responser.eInstance().setAsFile(str);
			runProcess(EnigmatorFactory.getFileEncryptProcess(new File(str)));
		}

	}
	
	private void runProcess(AbstractProcessor process) {
		if(process != null) {
			process.run();
			Response.eInstance().sendResponse(process.getResult());
		} else {
			LOGGER.warn(String.format("Process is empty, aborted operation"));
		}
	}

}
