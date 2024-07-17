package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;

// This class overrides the generated class and will be instantiated by factory
public class MaitreImpl extends GenMaitreImpl implements Maitre
{

	@Override
	public CreatureComponent getActiveCreatureComponent() {
		return this;
	}
	
	@Override
	public CreatureComponent getBaseEvolution() {
		return this.getEvolution();
	}

}
