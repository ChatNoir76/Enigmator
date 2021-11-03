/**
 */
package fr.chatnoir.enigmator.model.impl;

import fr.chatnoir.enigmator.model.About;
import fr.chatnoir.enigmator.model.Auteur;
import fr.chatnoir.enigmator.model.Disque;
import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.MModelPackage;
import fr.chatnoir.enigmator.model.Operation;

import fr.chatnoir.enigmator.service.EnigmatorException;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enigmator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getMicro <em>Micro</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getDisques <em>Disques</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEnigmatorImpl extends LabeledClassImpl implements Enigmator {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = "ChatNoir76";

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = "ChatNoirVIP";

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = "chatnoirvip@gmail.com";

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

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
	 * The cached value of the '{@link #getDisques() <em>Disques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisques()
	 * @generated
	 * @ordered
	 */
	protected EList<Disque> disques;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEnigmatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MModelPackage.Literals.ENIGMATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__MAIL, oldMail, mail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__DESCRIPTION, oldDescription,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__MAJOR, oldMajor, major));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__MINOR, oldMinor, minor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__MICRO, oldMicro, micro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Disque> getDisques() {
		if (disques == null) {
			disques = new EObjectContainmentEList<Disque>(Disque.class, this, MModelPackage.ENIGMATOR__DISQUES);
		}
		return disques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String execute(Operation operation, String source) throws EnigmatorException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MModelPackage.ENIGMATOR__DISQUES:
			return ((InternalEList<?>) getDisques()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MModelPackage.ENIGMATOR__NOM:
			return getNom();
		case MModelPackage.ENIGMATOR__PRENOM:
			return getPrenom();
		case MModelPackage.ENIGMATOR__MAIL:
			return getMail();
		case MModelPackage.ENIGMATOR__DESCRIPTION:
			return getDescription();
		case MModelPackage.ENIGMATOR__VERSION:
			return getVersion();
		case MModelPackage.ENIGMATOR__MAJOR:
			return getMajor();
		case MModelPackage.ENIGMATOR__MINOR:
			return getMinor();
		case MModelPackage.ENIGMATOR__MICRO:
			return getMicro();
		case MModelPackage.ENIGMATOR__DISQUES:
			return getDisques();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MModelPackage.ENIGMATOR__NOM:
			setNom((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__PRENOM:
			setPrenom((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__MAIL:
			setMail((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__VERSION:
			setVersion((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__MAJOR:
			setMajor((Integer) newValue);
			return;
		case MModelPackage.ENIGMATOR__MINOR:
			setMinor((Integer) newValue);
			return;
		case MModelPackage.ENIGMATOR__MICRO:
			setMicro((Integer) newValue);
			return;
		case MModelPackage.ENIGMATOR__DISQUES:
			getDisques().clear();
			getDisques().addAll((Collection<? extends Disque>) newValue);
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
		case MModelPackage.ENIGMATOR__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__MAIL:
			setMail(MAIL_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__MAJOR:
			setMajor(MAJOR_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__MINOR:
			setMinor(MINOR_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__MICRO:
			setMicro(MICRO_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__DISQUES:
			getDisques().clear();
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
		case MModelPackage.ENIGMATOR__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case MModelPackage.ENIGMATOR__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case MModelPackage.ENIGMATOR__MAIL:
			return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
		case MModelPackage.ENIGMATOR__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MModelPackage.ENIGMATOR__VERSION:
			return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
		case MModelPackage.ENIGMATOR__MAJOR:
			return major != MAJOR_EDEFAULT;
		case MModelPackage.ENIGMATOR__MINOR:
			return minor != MINOR_EDEFAULT;
		case MModelPackage.ENIGMATOR__MICRO:
			return micro != MICRO_EDEFAULT;
		case MModelPackage.ENIGMATOR__DISQUES:
			return disques != null && !disques.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Auteur.class) {
			switch (derivedFeatureID) {
			case MModelPackage.ENIGMATOR__NOM:
				return MModelPackage.AUTEUR__NOM;
			case MModelPackage.ENIGMATOR__PRENOM:
				return MModelPackage.AUTEUR__PRENOM;
			case MModelPackage.ENIGMATOR__MAIL:
				return MModelPackage.AUTEUR__MAIL;
			default:
				return -1;
			}
		}
		if (baseClass == About.class) {
			switch (derivedFeatureID) {
			case MModelPackage.ENIGMATOR__DESCRIPTION:
				return MModelPackage.ABOUT__DESCRIPTION;
			case MModelPackage.ENIGMATOR__VERSION:
				return MModelPackage.ABOUT__VERSION;
			case MModelPackage.ENIGMATOR__MAJOR:
				return MModelPackage.ABOUT__MAJOR;
			case MModelPackage.ENIGMATOR__MINOR:
				return MModelPackage.ABOUT__MINOR;
			case MModelPackage.ENIGMATOR__MICRO:
				return MModelPackage.ABOUT__MICRO;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Auteur.class) {
			switch (baseFeatureID) {
			case MModelPackage.AUTEUR__NOM:
				return MModelPackage.ENIGMATOR__NOM;
			case MModelPackage.AUTEUR__PRENOM:
				return MModelPackage.ENIGMATOR__PRENOM;
			case MModelPackage.AUTEUR__MAIL:
				return MModelPackage.ENIGMATOR__MAIL;
			default:
				return -1;
			}
		}
		if (baseClass == About.class) {
			switch (baseFeatureID) {
			case MModelPackage.ABOUT__DESCRIPTION:
				return MModelPackage.ENIGMATOR__DESCRIPTION;
			case MModelPackage.ABOUT__VERSION:
				return MModelPackage.ENIGMATOR__VERSION;
			case MModelPackage.ABOUT__MAJOR:
				return MModelPackage.ENIGMATOR__MAJOR;
			case MModelPackage.ABOUT__MINOR:
				return MModelPackage.ENIGMATOR__MINOR;
			case MModelPackage.ABOUT__MICRO:
				return MModelPackage.ENIGMATOR__MICRO;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MModelPackage.ENIGMATOR___EXECUTE__OPERATION_STRING:
			try {
				return execute((Operation) arguments.get(0), (String) arguments.get(1));
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", mail: ");
		result.append(mail);
		result.append(", description: ");
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

} //MEnigmatorImpl
