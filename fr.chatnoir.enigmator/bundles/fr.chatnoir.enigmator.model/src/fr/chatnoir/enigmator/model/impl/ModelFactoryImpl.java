package fr.chatnoir.enigmator.model.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.chatnoir.enigmator.model.ModelFactory;


// This factory  renames the generated factory interface to use it as an overriden factory
public class ModelFactoryImpl extends MModelFactoryImpl implements ModelFactory
{
	
	public static ModelFactory init() {
		
		try {
			Object fact = MModelFactoryImpl.init();
			if ((fact != null) && (fact instanceof ModelFactory))
					return (ModelFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl(); 
		 }
	

}
