package fr.chatnoir.enigmator.model;

import java.util.Arrays;

import fr.chatnoir.enigmator.model.impl.ModelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ModelFactory extends MModelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ModelFactory eINSTANCE = ModelFactoryImpl.init();
	/**
	 * No coding version, just repeat the same text
	 */
	default Enigmator createNoEncodingEnigmator() {
		Enigmator e = this.createEnigmator();
		
		Disque d1 = this.createDisque();
		d1.getChain().addAll(Arrays.asList('a'));
		d1.setIntervalle(0);
		
		e.getDisques().add(d1);
		return e;
	}
	/**
	 * No coding version, just repeat the same text with salt
	 */
	default Enigmator createNoEncodingWithSaltEnigmator() {
		Enigmator e = this.createEnigmator();
		
		Disque d1 = this.createDisque();
		d1.getChain().addAll(Arrays.asList('a'));
		d1.setIntervalle(3);
		
		e.getDisques().add(d1);
		return e;
	}
	/**
	 * Simple coding version by step 1
	 */
	default Enigmator createStepOneEnigmator() {
		Enigmator e = this.createEnigmator();
		
		Disque d1 = this.createDisque();
		d1.getChain().addAll(Arrays.asList('b'));
		d1.setIntervalle(0);
		
		e.getDisques().add(d1);
		return e;
	}
	/**
	 * Full encoding version
	 */
	default Enigmator createFullEncodingEnigmator() {
		Enigmator e = this.createEnigmator();
		
		Disque d1 = this.createDisque();
		d1.getChain().addAll(Arrays.asList('c','h','a','t','n','o','i','r','7','6'));
		d1.setIntervalle(3);
		e.getDisques().add(d1);
		
		Disque d2 = this.createDisque();
		d2.getChain().addAll(Arrays.asList('C','H','A','T'));
		d2.setIntervalle(1);
		e.getDisques().add(d2);
		
		Disque d3 = this.createDisque();
		d3.getChain().addAll(Arrays.asList('N','O','I','R'));
		d3.setIntervalle(4);
		e.getDisques().add(d3);
		
		Disque d4 = this.createDisque();
		d4.getChain().addAll(Arrays.asList('7','6'));
		d4.setIntervalle(4);
		e.getDisques().add(d4);
		
		e.setMajor(1);
		e.setMinor(0);
		e.setMicro(0);
		
		e.setDescription("First example with four disque");
		e.setMail("chatnoirvip@gmail.com");
		e.setNom("Noir");
		e.setPrenom("Chat");
//		e.setVersion("76");
		
		return e;
		
	}
	
				
}
