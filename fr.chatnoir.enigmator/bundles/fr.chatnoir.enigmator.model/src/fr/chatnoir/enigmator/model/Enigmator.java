package fr.chatnoir.enigmator.model;

import java.util.Optional;

// This interface overrides the generated interface and will be returned by factory
public interface Enigmator extends MEnigmator
{
	default public Optional<String> run() {
		String s;
		if(this.getTypeOperation() == operation.CRYPT) {
			s = "ENCRYPT METHOD NOT IMPLEMENTED"+"<" + this.getSource() + ">";
		} else if(this.getTypeOperation() == operation.UNCRYPT) {
			s = "UNCRYPT METHOD NOT IMPLEMENTED"+"<" + this.getSource() + ">";
		}else {
			s = null;
		}
		return Optional.ofNullable(s);
	}
}
