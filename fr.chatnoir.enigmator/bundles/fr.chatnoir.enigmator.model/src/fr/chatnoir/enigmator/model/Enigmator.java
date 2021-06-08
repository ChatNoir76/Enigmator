package fr.chatnoir.enigmator.model;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This interface overrides the generated interface and will be returned by factory
public interface Enigmator extends MEnigmator
{
	
	final static Logger logger = LoggerFactory.getLogger(Enigmator.class);
	final static int ASCII_MIN = 33;
	final static int ASCII_MAX = 125;
	final static int ACSII_UNKNOWN = 126;
	final int[] BLOCK_CHAIN = {50,-34,91,-26,24,-79,84,-34,81,0};
	
	default public Optional<String> run() {
		logger.debug("init de la methode run de enigmator");
		int signe = 0;
		String s = "";
		
		if(this.getTypeOperation() == operation.CRYPT) {
			signe = 1;
		} else if(this.getTypeOperation() == operation.UNCRYPT) {
			signe = -1;
		}
		
		if(signe == 1 || signe == -1) {
			for(int cursor = 0;cursor < this.getSource().length();cursor++) {
				char c = this.getSource().toCharArray()[cursor];
				logger.debug("Caractère : " + c);
				int number = c;
				logger.debug("ascii : " + number);
				
				if(number > ASCII_MIN - 1 && number < ASCII_MAX + 1) {
					s += conv(number, cursor, signe);
				} else {
					s += (char) ACSII_UNKNOWN;
				}
			}
		} else {
			s = null;
		}

		return Optional.ofNullable(s);
	}
	
	private char conv(int number, int counter, int signe) {
		int ascii = (number + (BLOCK_CHAIN[counter % BLOCK_CHAIN.length] * signe));
		
		if(ascii < ASCII_MIN) {
			ascii += ASCII_MAX - ASCII_MIN;
		} else if(ascii > ASCII_MAX) {
			ascii += ASCII_MIN - ASCII_MAX;
		}
		
		logger.debug("ascii modif : " + ascii);
		return (char) ascii;
	}
	
}
