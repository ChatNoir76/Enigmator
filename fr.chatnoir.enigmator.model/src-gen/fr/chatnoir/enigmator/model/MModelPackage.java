/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.chatnoir.enigmator.model.MModelFactory
 * @model kind="package"
 * @generated
 */
public interface MModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MModelPackage eINSTANCE = fr.chatnoir.enigmator.model.impl.MModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl <em>Enigmator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.impl.MEnigmatorImpl
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getEnigmator()
	 * @generated
	 */
	int ENIGMATOR = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__TYPE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Enigmator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enigmator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.operation <em>operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.operation
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getoperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * Returns the meta object for class '{@link fr.chatnoir.enigmator.model.MEnigmator <em>Enigmator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enigmator</em>'.
	 * @see fr.chatnoir.enigmator.model.MEnigmator
	 * @generated
	 */
	EClass getEnigmator();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MEnigmator#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.chatnoir.enigmator.model.MEnigmator#getSource()
	 * @see #getEnigmator()
	 * @generated
	 */
	EAttribute getEnigmator_Source();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MEnigmator#getTypeOperation <em>Type Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Operation</em>'.
	 * @see fr.chatnoir.enigmator.model.MEnigmator#getTypeOperation()
	 * @see #getEnigmator()
	 * @generated
	 */
	EAttribute getEnigmator_TypeOperation();

	/**
	 * Returns the meta object for enum '{@link fr.chatnoir.enigmator.model.operation <em>operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>operation</em>'.
	 * @see fr.chatnoir.enigmator.model.operation
	 * @generated
	 */
	EEnum getoperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.impl.MEnigmatorImpl <em>Enigmator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.impl.MEnigmatorImpl
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getEnigmator()
		 * @generated
		 */
		EClass ENIGMATOR = eINSTANCE.getEnigmator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENIGMATOR__SOURCE = eINSTANCE.getEnigmator_Source();

		/**
		 * The meta object literal for the '<em><b>Type Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENIGMATOR__TYPE_OPERATION = eINSTANCE.getEnigmator_TypeOperation();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.operation <em>operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.operation
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getoperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getoperation();

	}

} //MModelPackage
