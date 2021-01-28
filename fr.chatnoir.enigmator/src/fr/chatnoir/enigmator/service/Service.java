package fr.chatnoir.enigmator.service;

import java.util.Optional;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.operation;

public class Service {

	private static String execute(String input, operation o){
		Enigmator e = ModelFactory.eINSTANCE.createEnigmator();
		e.setSource(input);
		e.setTypeOperation(o);
		Optional<String> opt =  e.getOutput();
		return opt.isPresent() ? opt.get() : "n/a";
	}
	
	public static String encrypt(String input) {
		return execute(input, operation.CRYPT);
	}
	
	public static String uncrypt(String input) {
		return execute(input, operation.UNCRYPT);
	}
}
