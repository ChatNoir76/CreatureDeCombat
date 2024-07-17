package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;


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

	@Override
	public Base createBase() {
		Base base = super.createBase();
		base.setNiveau(Niveau.BASE);
		return base;
	}

	@Override
	public Evolution createEvolution() {
		Evolution evolution = super.createEvolution();
		evolution.setNiveau(Niveau.EVOLUTION);
		return evolution;
	}

	@Override
	public Maitre createMaitre() {
		Maitre maitre = super.createMaitre();
		maitre.setNiveau(Niveau.MAITRE);
		return maitre;
	}
	

}
