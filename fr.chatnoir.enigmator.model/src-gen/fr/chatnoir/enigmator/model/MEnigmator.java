/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enigmator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.MEnigmator#getSource <em>Source</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MEnigmator#getTypeOperation <em>Type Operation</em>}</li>
 * </ul>
 *
 * @see fr.chatnoir.enigmator.model.MModelPackage#getEnigmator()
 * @model
 * @generated
 */
public interface MEnigmator extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getEnigmator_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MEnigmator#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Type Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.chatnoir.enigmator.model.operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Operation</em>' attribute.
	 * @see fr.chatnoir.enigmator.model.operation
	 * @see #setTypeOperation(operation)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getEnigmator_TypeOperation()
	 * @model
	 * @generated
	 */
	operation getTypeOperation();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MEnigmator#getTypeOperation <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Operation</em>' attribute.
	 * @see fr.chatnoir.enigmator.model.operation
	 * @see #getTypeOperation()
	 * @generated
	 */
	void setTypeOperation(operation value);

} // MEnigmator
