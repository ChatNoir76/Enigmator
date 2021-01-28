/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.chatnoir.enigmator.model.MModelPackage
 * @generated
 */
public interface MModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MModelFactory eINSTANCE = fr.chatnoir.enigmator.model.impl.MModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enigmator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enigmator</em>'.
	 * @generated
	 */
	Enigmator createEnigmator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MModelPackage getModelPackage();

} //MModelFactory
