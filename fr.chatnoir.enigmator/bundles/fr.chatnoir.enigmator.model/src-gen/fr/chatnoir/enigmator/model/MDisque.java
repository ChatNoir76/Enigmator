/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.MDisque#getIntervalle <em>Intervalle</em>}</li>
 * </ul>
 *
 * @see fr.chatnoir.enigmator.model.MModelPackage#getDisque()
 * @model
 * @generated
 */
public interface MDisque extends LabeledClass {
	/**
	 * Returns the value of the '<em><b>Intervalle</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle</em>' attribute.
	 * @see #setIntervalle(int)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getDisque_Intervalle()
	 * @model default="1"
	 * @generated
	 */
	int getIntervalle();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MDisque#getIntervalle <em>Intervalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle</em>' attribute.
	 * @see #getIntervalle()
	 * @generated
	 */
	void setIntervalle(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Character> getChain();

} // MDisque
