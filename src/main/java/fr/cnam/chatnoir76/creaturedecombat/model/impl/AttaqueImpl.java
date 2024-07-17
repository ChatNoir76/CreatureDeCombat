package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import java.util.function.Predicate;

import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;

// This class overrides the generated class and will be instantiated by factory
public class AttaqueImpl extends GenAttaqueImpl implements Attaque
{
	@Override
	public boolean estDisponible(Creature creature) {
		Predicate<Energie> est_categorie = e -> this.categorie.equals(e.getCategorie());
		Predicate<Energie> est_autre = e -> !this.categorie.equals(e.getCategorie());
		
		int energie_categorie = (int) creature.getEnergies().stream().filter(est_categorie).count();
		int energie_autre = (int) creature.getEnergies().stream().filter(est_autre).count();
		int energie_bonus = energie_categorie - this.getBesoinEnergieCategorie() > 0 ? energie_categorie - this.getBesoinEnergieCategorie() : 0;
		
		if(energie_categorie - this.getBesoinEnergieCategorie() < 0) return false;
		if(energie_autre - this.getBesoinEnergieAutre() + energie_bonus < 0) return false;
		return true;
	}

	@Override
	public boolean estCompatible(Creature creature) {
		if(this.categorie != Categorie.CLASSIQUE) {
			return this.categorie.equals(creature.getCategorie());
		} else {
			return true;
		}
	}

	@Override
	public void attaque(Creature attaquant, Creature defenseur) {
		
		int degatAttaquant = this.getDegatAttaque().getCalculDegat(attaquant, defenseur);
		int protectionDefenseur = defenseur.getDegatDefense().getCalculDegat(attaquant, defenseur);
		
		if(degatAttaquant < 0) {
			//Régénération de l'attaquant
			attaquant.setPv(attaquant.getPv() - degatAttaquant);
		} else {
			if(protectionDefenseur < 0) {
				//attaque et protection
				int diff = degatAttaquant - protectionDefenseur;
				int degat = diff < 0 ? 0 : diff;
				defenseur.setPv(defenseur.getPv() - degat);
			} else {
				//attaque et contre-attaque
				defenseur.setPv(defenseur.getPv() - degatAttaquant);
				attaquant.setPv(attaquant.getPv() - protectionDefenseur);
			}
		}
	}
}
