package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;

// This class overrides the generated class and will be instantiated by factory
public class DegatImpl extends GenDegatImpl implements Degat
{

	@Override
	public void setDegat(int newDegat) {
		if(this.modeCalcul != CalculDegat.BASE) {
			if(newDegat < 0) newDegat = 0;
			if(newDegat > 100) newDegat = 100;
		}
		super.setDegat(newDegat);
	}

	@Override
	public void setIncertitude(int newIncertitude) {
		if(newIncertitude < 0) newIncertitude = 0;
		if(newIncertitude > 100) newIncertitude = 100;
		super.setIncertitude(newIncertitude);
	}

	@Override
	public void setChanceRattage(int newChanceRattage) {
		if(newChanceRattage < 0) newChanceRattage = 0;
		if(newChanceRattage > 100) newChanceRattage = 100;
		super.setChanceRattage(newChanceRattage);
	}

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
