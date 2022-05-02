/**
 */
package fr.chatnoir.enigmator.model.impl;

import fr.chatnoir.enigmator.model.Disque;
import fr.chatnoir.enigmator.model.MModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MDisqueImpl#getIntervalle <em>Intervalle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDisqueImpl extends LabeledClassImpl implements Disque {
	/**
	 * The default value of the '{@link #getIntervalle() <em>Intervalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalle()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVALLE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getIntervalle() <em>Intervalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalle()
	 * @generated
	 * @ordered
	 */
	protected int intervalle = INTERVALLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDisqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MModelPackage.Literals.DISQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntervalle() {
		return intervalle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalle(int newIntervalle) {
		int oldIntervalle = intervalle;
		intervalle = newIntervalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.DISQUE__INTERVALLE, oldIntervalle,
					intervalle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Character> getChain() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MModelPackage.DISQUE__INTERVALLE:
			return getIntervalle();
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
		case MModelPackage.DISQUE__INTERVALLE:
			setIntervalle((Integer) newValue);
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
		case MModelPackage.DISQUE__INTERVALLE:
			setIntervalle(INTERVALLE_EDEFAULT);
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
		case MModelPackage.DISQUE__INTERVALLE:
			return intervalle != INTERVALLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MModelPackage.DISQUE___GET_CHAIN:
			return getChain();
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
		result.append(" (intervalle: ");
		result.append(intervalle);
		result.append(')');
		return result.toString();
	}

} //MDisqueImpl
