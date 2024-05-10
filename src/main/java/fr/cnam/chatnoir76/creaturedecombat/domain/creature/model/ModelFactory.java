package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.ModelFactoryImpl;

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
				
}
