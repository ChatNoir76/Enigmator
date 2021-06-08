package fr.chatnoir.enigmator.model;

import fr.chatnoir.enigmator.model.impl.ModelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ModelFactory extends MModelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ModelFactory eINSTANCE = ModelFactoryImpl.init();
				
}
