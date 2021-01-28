/**
 */
package fr.chatnoir.enigmator.model.impl;

import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.MModelPackage;
import fr.chatnoir.enigmator.model.operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enigmator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl#getTypeOperation <em>Type Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEnigmatorImpl extends MinimalEObjectImpl.Container implements Enigmator {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final operation TYPE_OPERATION_EDEFAULT = operation.NONE;

	/**
	 * The cached value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected operation typeOperation = TYPE_OPERATION_EDEFAULT;

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
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operation getTypeOperation() {
		return typeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOperation(operation newTypeOperation) {
		operation oldTypeOperation = typeOperation;
		typeOperation = newTypeOperation == null ? TYPE_OPERATION_EDEFAULT : newTypeOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MModelPackage.ENIGMATOR__TYPE_OPERATION,
					oldTypeOperation, typeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MModelPackage.ENIGMATOR__SOURCE:
			return getSource();
		case MModelPackage.ENIGMATOR__TYPE_OPERATION:
			return getTypeOperation();
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
		case MModelPackage.ENIGMATOR__SOURCE:
			setSource((String) newValue);
			return;
		case MModelPackage.ENIGMATOR__TYPE_OPERATION:
			setTypeOperation((operation) newValue);
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
		case MModelPackage.ENIGMATOR__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case MModelPackage.ENIGMATOR__TYPE_OPERATION:
			setTypeOperation(TYPE_OPERATION_EDEFAULT);
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
		case MModelPackage.ENIGMATOR__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		case MModelPackage.ENIGMATOR__TYPE_OPERATION:
			return typeOperation != TYPE_OPERATION_EDEFAULT;
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
		result.append(" (source: ");
		result.append(source);
		result.append(", typeOperation: ");
		result.append(typeOperation);
		result.append(')');
		return result.toString();
	}

} //MEnigmatorImpl
