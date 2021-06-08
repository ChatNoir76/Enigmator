package fr.chatnoir.enigmator.core;

import java.util.List;

import fr.chatnoir.enigmator.core.arguments.ArgsProcessor;

public class EnigmatorFactory {

	public static ArgsProcessor createArgsProcessor(List<String> args) {
		return new ArgsProcessor(args);
	}
	
}
