package fr.chatnoir.enigmator.core;

import java.io.File;

import fr.chatnoir.enigmator.core.processes.AbstractProcessor;
import fr.chatnoir.enigmator.core.processes.DecryptProcessor;
import fr.chatnoir.enigmator.core.processes.EncryptProcessor;

public class EnigmatorFactory {
	
	public static final AbstractProcessor getEncryptProcess(String source) {
		return new EncryptProcessor(source);
	}
	
	public static final AbstractProcessor getFileEncryptProcess(File file) {
		return new EncryptProcessor(file);
	}
	
	public static final AbstractProcessor getDecryptProcess(String source) {
		return new DecryptProcessor(source);
	}
	
	public static final AbstractProcessor getFileDecryptProcess(File file) {
		return new DecryptProcessor(file);
	}
	
}
