package fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model;

import fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.ModelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ModelFactory extends GenModelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ModelFactory eINSTANCE = ModelFactoryImpl.init();
				
}
