/**
 */
package fr.chatnoir.enigmator.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.impl.MLabeledClassImpl <em>Labeled Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.impl.MLabeledClassImpl
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getLabeledClass()
	 * @generated
	 */
	int LABELED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Labeled Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Labeled Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CLASS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__NAME = LABELED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__NOM = LABELED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__PRENOM = LABELED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__MAIL = LABELED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__DESCRIPTION = LABELED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__VERSION = LABELED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__MAJOR = LABELED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__MINOR = LABELED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Micro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__MICRO = LABELED_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR__DISQUES = LABELED_CLASS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Enigmator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR_FEATURE_COUNT = LABELED_CLASS_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR___EXECUTE__OPERATION_STRING = LABELED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enigmator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIGMATOR_OPERATION_COUNT = LABELED_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.impl.MDisqueImpl <em>Disque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.impl.MDisqueImpl
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getDisque()
	 * @generated
	 */
	int DISQUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISQUE__NAME = LABELED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Intervalle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISQUE__INTERVALLE = LABELED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISQUE_FEATURE_COUNT = LABELED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISQUE___GET_CHAIN = LABELED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISQUE_OPERATION_COUNT = LABELED_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.impl.MAuteurImpl <em>Auteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.impl.MAuteurImpl
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getAuteur()
	 * @generated
	 */
	int AUTEUR = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR__MAIL = 2;

	/**
	 * The number of structural features of the '<em>Auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Auteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.impl.MAboutImpl <em>About</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.impl.MAboutImpl
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getAbout()
	 * @generated
	 */
	int ABOUT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__MAJOR = 2;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__MINOR = 3;

	/**
	 * The feature id for the '<em><b>Micro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__MICRO = 4;

	/**
	 * The number of structural features of the '<em>About</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>About</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chatnoir.enigmator.model.Operation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.model.Operation
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The meta object id for the '<em>Enigmator Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chatnoir.enigmator.service.exception.EnigmatorException
	 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getEnigmatorException()
	 * @generated
	 */
	int ENIGMATOR_EXCEPTION = 6;

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
	 * Returns the meta object for the containment reference list '{@link fr.chatnoir.enigmator.model.MEnigmator#getDisques <em>Disques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disques</em>'.
	 * @see fr.chatnoir.enigmator.model.MEnigmator#getDisques()
	 * @see #getEnigmator()
	 * @generated
	 */
	EReference getEnigmator_Disques();

	/**
	 * Returns the meta object for the '{@link fr.chatnoir.enigmator.model.MEnigmator#execute(fr.chatnoir.enigmator.model.Operation, java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see fr.chatnoir.enigmator.model.MEnigmator#execute(fr.chatnoir.enigmator.model.Operation, java.lang.String)
	 * @generated
	 */
	EOperation getEnigmator__Execute__Operation_String();

	/**
	 * Returns the meta object for class '{@link fr.chatnoir.enigmator.model.MDisque <em>Disque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disque</em>'.
	 * @see fr.chatnoir.enigmator.model.MDisque
	 * @generated
	 */
	EClass getDisque();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MDisque#getIntervalle <em>Intervalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intervalle</em>'.
	 * @see fr.chatnoir.enigmator.model.MDisque#getIntervalle()
	 * @see #getDisque()
	 * @generated
	 */
	EAttribute getDisque_Intervalle();

	/**
	 * Returns the meta object for the '{@link fr.chatnoir.enigmator.model.MDisque#getChain() <em>Get Chain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chain</em>' operation.
	 * @see fr.chatnoir.enigmator.model.MDisque#getChain()
	 * @generated
	 */
	EOperation getDisque__GetChain();

	/**
	 * Returns the meta object for class '{@link fr.chatnoir.enigmator.model.MLabeledClass <em>Labeled Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Class</em>'.
	 * @see fr.chatnoir.enigmator.model.MLabeledClass
	 * @generated
	 */
	EClass getLabeledClass();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MLabeledClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.chatnoir.enigmator.model.MLabeledClass#getName()
	 * @see #getLabeledClass()
	 * @generated
	 */
	EAttribute getLabeledClass_Name();

	/**
	 * Returns the meta object for class '{@link fr.chatnoir.enigmator.model.MAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auteur</em>'.
	 * @see fr.chatnoir.enigmator.model.MAuteur
	 * @generated
	 */
	EClass getAuteur();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAuteur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.chatnoir.enigmator.model.MAuteur#getNom()
	 * @see #getAuteur()
	 * @generated
	 */
	EAttribute getAuteur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAuteur#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fr.chatnoir.enigmator.model.MAuteur#getPrenom()
	 * @see #getAuteur()
	 * @generated
	 */
	EAttribute getAuteur_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAuteur#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see fr.chatnoir.enigmator.model.MAuteur#getMail()
	 * @see #getAuteur()
	 * @generated
	 */
	EAttribute getAuteur_Mail();

	/**
	 * Returns the meta object for class '{@link fr.chatnoir.enigmator.model.MAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>About</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout
	 * @generated
	 */
	EClass getAbout();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAbout#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout#getDescription()
	 * @see #getAbout()
	 * @generated
	 */
	EAttribute getAbout_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAbout#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout#getVersion()
	 * @see #getAbout()
	 * @generated
	 */
	EAttribute getAbout_Version();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAbout#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout#getMajor()
	 * @see #getAbout()
	 * @generated
	 */
	EAttribute getAbout_Major();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAbout#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout#getMinor()
	 * @see #getAbout()
	 * @generated
	 */
	EAttribute getAbout_Minor();

	/**
	 * Returns the meta object for the attribute '{@link fr.chatnoir.enigmator.model.MAbout#getMicro <em>Micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro</em>'.
	 * @see fr.chatnoir.enigmator.model.MAbout#getMicro()
	 * @see #getAbout()
	 * @generated
	 */
	EAttribute getAbout_Micro();

	/**
	 * Returns the meta object for enum '{@link fr.chatnoir.enigmator.model.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see fr.chatnoir.enigmator.model.Operation
	 * @generated
	 */
	EEnum getOperation();

	/**
	 * Returns the meta object for data type '{@link fr.chatnoir.enigmator.service.exception.EnigmatorException <em>Enigmator Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enigmator Exception</em>'.
	 * @see fr.chatnoir.enigmator.service.exception.EnigmatorException
	 * @model instanceClass="fr.chatnoir.enigmator.service.EnigmatorException"
	 * @generated
	 */
	EDataType getEnigmatorException();

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
		 * The meta object literal for the '<em><b>Disques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENIGMATOR__DISQUES = eINSTANCE.getEnigmator_Disques();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENIGMATOR___EXECUTE__OPERATION_STRING = eINSTANCE.getEnigmator__Execute__Operation_String();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.impl.MDisqueImpl <em>Disque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.impl.MDisqueImpl
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getDisque()
		 * @generated
		 */
		EClass DISQUE = eINSTANCE.getDisque();

		/**
		 * The meta object literal for the '<em><b>Intervalle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISQUE__INTERVALLE = eINSTANCE.getDisque_Intervalle();

		/**
		 * The meta object literal for the '<em><b>Get Chain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISQUE___GET_CHAIN = eINSTANCE.getDisque__GetChain();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.impl.MLabeledClassImpl <em>Labeled Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.impl.MLabeledClassImpl
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getLabeledClass()
		 * @generated
		 */
		EClass LABELED_CLASS = eINSTANCE.getLabeledClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_CLASS__NAME = eINSTANCE.getLabeledClass_Name();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.impl.MAuteurImpl <em>Auteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.impl.MAuteurImpl
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getAuteur()
		 * @generated
		 */
		EClass AUTEUR = eINSTANCE.getAuteur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTEUR__NOM = eINSTANCE.getAuteur_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTEUR__PRENOM = eINSTANCE.getAuteur_Prenom();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTEUR__MAIL = eINSTANCE.getAuteur_Mail();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.impl.MAboutImpl <em>About</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.impl.MAboutImpl
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getAbout()
		 * @generated
		 */
		EClass ABOUT = eINSTANCE.getAbout();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT__DESCRIPTION = eINSTANCE.getAbout_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT__VERSION = eINSTANCE.getAbout_Version();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT__MAJOR = eINSTANCE.getAbout_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT__MINOR = eINSTANCE.getAbout_Minor();

		/**
		 * The meta object literal for the '<em><b>Micro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT__MICRO = eINSTANCE.getAbout_Micro();

		/**
		 * The meta object literal for the '{@link fr.chatnoir.enigmator.model.Operation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.model.Operation
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getOperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em>Enigmator Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chatnoir.enigmator.service.exception.EnigmatorException
		 * @see fr.chatnoir.enigmator.model.impl.MModelPackageImpl#getEnigmatorException()
		 * @generated
		 */
		EDataType ENIGMATOR_EXCEPTION = eINSTANCE.getEnigmatorException();

	}

} //MModelPackage
