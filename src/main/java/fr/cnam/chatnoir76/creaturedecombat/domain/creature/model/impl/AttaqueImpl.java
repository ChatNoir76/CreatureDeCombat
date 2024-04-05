package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;

// This class overrides the generated class and will be instantiated by factory
public class AttaqueImpl extends GenAttaqueImpl implements Attaque
{
	@Override
	public boolean estDisponible(Creature creature) {

		int primaire = (int) creature.getEnergies().stream().filter(e -> this.categorie.equals(e.getCategorie())).count();
		int secondaire = (int) creature.getEnergies().stream().filter(e -> !this.categorie.equals(e.getCategorie())).count();
		
		int primaireValue = primaire - this.getBesoinEnergieCategorie();
		int secondaireValue = secondaire - this.getBesoinEnergieAutre();
		
		return primaireValue<=0 && secondaireValue<=0;
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
	public void attaque(Creature lanceur, Creature receveur) {
		
		int degatAttaquant = this.getDegatAttaque().getCalculDegat(lanceur, receveur);
		int protectionDefenseur = receveur.getDegatDefense().getCalculDegat(lanceur, receveur);
		
		if(degatAttaquant < 0) {
			//Régénération de l'attaquant
			lanceur.setPv(lanceur.getPv() - degatAttaquant);
		} else {
			if(protectionDefenseur < 0) {
				//attaque et protection
				int diff = degatAttaquant - protectionDefenseur;
				int degat = diff < 0 ? 0 : diff;
				receveur.setPv(receveur.getPv() - degat);
			} else {
				//attaque et contre-attaque
				receveur.setPv(receveur.getPv() - degatAttaquant);
				lanceur.setPv(lanceur.getPv() - protectionDefenseur);
			}
		}
	}
}
