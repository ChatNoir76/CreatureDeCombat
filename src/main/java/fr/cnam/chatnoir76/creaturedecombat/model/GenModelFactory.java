/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage
 * @generated
 */
public interface GenModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenModelFactory eINSTANCE = fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Energie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energie</em>'.
	 * @generated
	 */
	Energie createEnergie();

	/**
	 * Returns a new object of class '<em>Creature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creature</em>'.
	 * @generated
	 */
	Creature createCreature();

	/**
	 * Returns a new object of class '<em>Attaque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attaque</em>'.
	 * @generated
	 */
	Attaque createAttaque();

	/**
	 * Returns a new object of class '<em>Degat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degat</em>'.
	 * @generated
	 */
	Degat createDegat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenModelPackage getModelPackage();

} //GenModelFactory
