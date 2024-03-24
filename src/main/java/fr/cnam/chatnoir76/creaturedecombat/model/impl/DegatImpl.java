package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;

// This class overrides the generated class and will be instantiated by factory
public class DegatImpl extends GenDegatImpl implements Degat
{

	@Override
	public int getCalculDegat(Creature attaquant, Creature defenseur) {
		int degat = 0;
		
		if(processRattage()) {
			switch(this.getModeCalcul()) {
			case BASE:
				degat = this.getDegat();
				break;
			case RATIO_ATTAQUANT:
				degat = this.getDegat()*attaquant.getPv()/100;
				break;
			case RATIO_DEFENSEUR:
				degat = this.getDegat()*defenseur.getPv()/100;
				break;
			}
			
			degat = processPrecision(degat);
		} 
		
		return degat * this.getType().getValue();
	}
	

}
