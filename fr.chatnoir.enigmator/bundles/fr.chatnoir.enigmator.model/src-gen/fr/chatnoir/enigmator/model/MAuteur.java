/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.MAuteur#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAuteur#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAuteur#getMail <em>Mail</em>}</li>
 * </ul>
 *
 * @see fr.chatnoir.enigmator.model.MModelPackage#getAuteur()
 * @model
 * @generated
 */
public interface MAuteur extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The default value is <code>"ChatNoir76"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAuteur_Nom()
	 * @model default="ChatNoir76"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAuteur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * The default value is <code>"ChatNoirVIP"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAuteur_Prenom()
	 * @model default="ChatNoirVIP"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAuteur#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * The default value is <code>"chatnoirvip@gmail.com"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAuteur_Mail()
	 * @model default="chatnoirvip@gmail.com"
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAuteur#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

} // MAuteur
