package fr.chatnoir.enigmator.model;

import java.util.Arrays;
import java.util.List;

// This interface overrides the generated interface and will be returned by factory
public interface Enigmator extends MEnigmator
{
	/**
	 * Avalaible characters
	 */
	final public List<Character> table = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
				   's','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I',
				   'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' ','@',',','.','?','!',':','%','-','_');
	/**
	 * char to replace unknown character
	 */
	final public char unknownAsChar = '#';
	final public int unknownAsInt = -1;
	/**
	 * conversion from char to number
	 * @param caractere char to convert
	 * @return converted number
	 */
	default public int getNumber(char caractere) {
		if(table.contains(caractere)) {
			return table.indexOf(caractere);
		} else {
			return unknownAsInt;
		}
	}
	/**
	 * conversion from number to char
	 * @param number number to convert
	 * @return converted char
	 */
	default public char getChar(int number) {
		if(number > unknownAsInt && number < table.size()) {
			return table.get(number);
		} else {
			return unknownAsChar;
		}
	}
}
