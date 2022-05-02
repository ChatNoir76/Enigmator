/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>About</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.MAbout#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAbout#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAbout#getMajor <em>Major</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAbout#getMinor <em>Minor</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.MAbout#getMicro <em>Micro</em>}</li>
 * </ul>
 *
 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout()
 * @model
 * @generated
 */
public interface MAbout extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"syst\u00e8me de g\u00e9n\u00e9ration par d\u00e9faut"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout_Description()
	 * @model default="syst\u00e8me de g\u00e9n\u00e9ration par d\u00e9faut"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAbout#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout_Version()
	 * @model default="" volatile="true" derived="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAbout#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout_Major()
	 * @model default="0"
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAbout#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout_Minor()
	 * @model default="0"
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAbout#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

	/**
	 * Returns the value of the '<em><b>Micro</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micro</em>' attribute.
	 * @see #setMicro(int)
	 * @see fr.chatnoir.enigmator.model.MModelPackage#getAbout_Micro()
	 * @model default="0"
	 * @generated
	 */
	int getMicro();

	/**
	 * Sets the value of the '{@link fr.chatnoir.enigmator.model.MAbout#getMicro <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Micro</em>' attribute.
	 * @see #getMicro()
	 * @generated
	 */
	void setMicro(int value);

} // MAbout
