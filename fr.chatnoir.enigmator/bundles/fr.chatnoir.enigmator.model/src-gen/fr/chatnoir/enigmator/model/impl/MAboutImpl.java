/**
 */
package fr.chatnoir.enigmator.model.impl;

import fr.chatnoir.enigmator.model.About;
import fr.chatnoir.enigmator.model.MAbout;
import fr.chatnoir.enigmator.model.MModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>About</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MAboutImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MAboutImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MAboutImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MAboutImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MAboutImpl#getMicro <em>Micro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAboutImpl extends MinimalEObjectImpl.Container implements MAbout {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "syst\u00e8me de g\u00e9n\u00e9ration par d\u00e9faut";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected int major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected int minor = MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMicro() <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicro()
	 * @generated
	 * @ordered
	 */
	protected static final int MICRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMicro() <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicro()
	 * @generated
	 * @ordered
	 */
	protected int micro = MICRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAboutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MModelPackage.Literals.ABOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ABOUT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		// TODO: implement this method to return the 'Version' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		// TODO: implement this method to set the 'Version' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(int newMajor) {
		int oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ABOUT__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinor(int newMinor) {
		int oldMinor = minor;
		minor = newMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ABOUT__MINOR, oldMinor, minor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMicro() {
		return micro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicro(int newMicro) {
		int oldMicro = micro;
		micro = newMicro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ABOUT__MICRO, oldMicro, micro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MModelPackage.ABOUT__DESCRIPTION:
			return getDescription();
		case MModelPackage.ABOUT__VERSION:
			return getVersion();
		case MModelPackage.ABOUT__MAJOR:
			return getMajor();
		case MModelPackage.ABOUT__MINOR:
			return getMinor();
		case MModelPackage.ABOUT__MICRO:
			return getMicro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MModelPackage.ABOUT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MModelPackage.ABOUT__VERSION:
			setVersion((String) newValue);
			return;
		case MModelPackage.ABOUT__MAJOR:
			setMajor((Integer) newValue);
			return;
		case MModelPackage.ABOUT__MINOR:
			setMinor((Integer) newValue);
			return;
		case MModelPackage.ABOUT__MICRO:
			setMicro((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MModelPackage.ABOUT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MModelPackage.ABOUT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case MModelPackage.ABOUT__MAJOR:
			setMajor(MAJOR_EDEFAULT);
			return;
		case MModelPackage.ABOUT__MINOR:
			setMinor(MINOR_EDEFAULT);
			return;
		case MModelPackage.ABOUT__MICRO:
			setMicro(MICRO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MModelPackage.ABOUT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MModelPackage.ABOUT__VERSION:
			return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
		case MModelPackage.ABOUT__MAJOR:
			return major != MAJOR_EDEFAULT;
		case MModelPackage.ABOUT__MINOR:
			return minor != MINOR_EDEFAULT;
		case MModelPackage.ABOUT__MICRO:
			return micro != MICRO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", major: ");
		result.append(major);
		result.append(", minor: ");
		result.append(minor);
		result.append(", micro: ");
		result.append(micro);
		result.append(')');
		return result.toString();
	}

} //MAboutImpl
