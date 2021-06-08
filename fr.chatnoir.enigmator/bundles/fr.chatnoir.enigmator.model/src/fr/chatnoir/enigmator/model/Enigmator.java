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
	final static int NUMBER_MAX = 63;
	final static int ACSII_UNKNOWN = 126;
	final int[] MIXER_CHAIN = {5, -3, 7, -9, 5, -12, 9, -5, 6, -3, 4, -7, 2, -3, 4, 0, -1, 6, -7};
	
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
				int ascii = c;
				logger.debug("ascii : " + ascii);
				int number = asciiToNumber(ascii);
				logger.debug("number : " + number);
				int mixedNumber = mixer(number, cursor, signe);
				logger.debug("mixedNumber : " + mixedNumber);
				int newascii = NumberToAscii(mixedNumber);
				logger.debug("New ascii : " + newascii);
				s += (char) newascii;

			}
		} else {
			s = null;
		}

		return Optional.ofNullable(s);
	}
	/**
	 * Conversion d'un caractère ascii en nombre interprétable par le système
	 * @param ascii
	 * @return index de la char chain
	 */
	private int asciiToNumber(int ascii) {
		if(ascii >= 48 && ascii <= 57) {
			return ascii - 47; // 1 -> 10
		} else if(ascii >= 65 && ascii <= 90) {
			return ascii - 64 + 10; // 11 -> 36
		} else if(ascii == 95){
			return 63;
		}else if(ascii >= 97 && ascii <= 122) {
			return ascii - 96 + 36; // 37 -> 62
		} else {
			return 0; //inconnu
		}
	}
	/**
	 * Conversion d'un élément de la char chain en ascii
	 * @param number
	 * @return ascii
	 */
	private int NumberToAscii(int number) {
		if(number >= 1 && number <= 10) {
			return number + 47; // 48 -> 57
		} else if(number >= 11 && number <= 36) {
			return number + 64 - 10; // 65 -> 90
		} else if(number == 63){
			return 95;
		} else if(number >= 37 && number <= 122) {
			return number + 96 - 36; // 97 -> 122
		} else {
			return 0; //inconnu
		}
	}
	
	/**
	 * Transforme le number d'après les règles de la mixer_chain
	 * @param number
	 * @param counter
	 * @param signe
	 * @return
	 */
	private int mixer(int number, int counter, int signe) {
		int mixedNumber = (number + (MIXER_CHAIN[counter % MIXER_CHAIN.length] * signe));
		
		while(mixedNumber < 1) {
			mixedNumber += NUMBER_MAX;
		}
		if(mixedNumber > NUMBER_MAX) {
			mixedNumber %= NUMBER_MAX;
		}
		
		return mixedNumber;
	}
	
}
