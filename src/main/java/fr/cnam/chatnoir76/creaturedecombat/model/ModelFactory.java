package fr.cnam.chatnoir76.creaturedecombat.model;

import fr.cnam.chatnoir76.creaturedecombat.model.impl.ModelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ModelFactory extends GenModelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ModelFactory eINSTANCE = ModelFactoryImpl.init();
				
}
