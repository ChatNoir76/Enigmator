package fr.chatnoir.enigmator.model.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.chatnoir.enigmator.model.Disque;

// This class overrides the generated class and will be instantiated by factory
public class DisqueImpl extends MDisqueImpl implements Disque
{
	private EList<Character> chain = new BasicEList<Character>();
	
	@Override
	public EList<Character> getChain() {
		return chain;
	}

}
