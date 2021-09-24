/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.common.util.EList;

import fr.chatnoir.enigmator.service.exception.EnigmatorException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enigmator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.MEnigmator#getDisques <em>Disques</em>}</li>
 * </ul>
 *
 * @see fr.chatnoir.enigmator.model.MModelPackage#getEnigmator()
 * @model
 * @generated
 */
public interface MEnigmator extends LabeledClass, Auteur, About {
	/**
	 * Returns the value of the '<em><b>Disques</b></em>' containment reference list.
	 * The list contents are of type {@link fr.chatnoir.enigmator.model.Disque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disques</em>' containment reference list.
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getEnigmator_Disques()
	 * @model containment="true"
	 * @generated
	 */
	EList<Disque> getDisques();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.chatnoir.enigmator.model.EnigmatorException"
	 * @generated
	 */
	String execute(Operation operation, String source) throws EnigmatorException;

} // MEnigmator
