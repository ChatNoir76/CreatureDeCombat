package fr.cnam.chatnoir76.creaturedecombat.model;

import fr.cnam.chatnoir76.creaturedecombat.model.impl.ModelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ModelFactory extends GenModelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ModelFactory eINSTANCE = ModelFactoryImpl.init();
	
	default public Creature createCreature(CreatureComponent creatureComp) {
		Creature creature = this.createCreature();
		creature.initialize(creatureComp);
		return creature;
	}
	
	default public Base createDefaultBase() {
		Base base = ModelFactory.eINSTANCE.createBase();
		base.setNom("Default_Nom");
		base.setDescription("Default_Description");
		base.setPvInit(0);
		base.setCategorie(Categorie.CLASSIQUE);
		return base;
	}

	default public Energie createEnergie(Categorie categorie) {
		Energie energie = this.createEnergie();
		energie.setCategorie(categorie);
		return energie;
	}
				
}
