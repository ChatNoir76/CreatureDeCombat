package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;


// This factory  renames the generated factory interface to use it as an overriden factory
public class ModelFactoryImpl extends GenModelFactoryImpl implements ModelFactory
{
	
	public static ModelFactory init() {
		
		try {
			Object fact = GenModelFactoryImpl.init();
			if ((fact != null) && (fact instanceof ModelFactory))
					return (ModelFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl(); 
		 }
	

}
