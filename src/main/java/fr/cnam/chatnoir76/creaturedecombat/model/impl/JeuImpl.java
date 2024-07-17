package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import org.eclipse.emf.common.util.EList;

import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;

// This class overrides the generated class and will be instantiated by factory
public class JeuImpl extends GenJeuImpl implements Jeu
{

	@Override
	public void finTour() {
		// TODO Auto-generated method stub
		super.finTour();
	}

	@Override
	public void finOption() {
		// TODO Auto-generated method stub
		super.finOption();
	}

	@Override
	public void abandonner() {
		// TODO Auto-generated method stub
		super.abandonner();
	}

	@Override
	public Carte piocher() {
		// TODO Auto-generated method stub
		return super.piocher();
	}

	@Override
	public boolean ajoutCarteBase(Carte carteCreatureBase) {
		// TODO Auto-generated method stub
		return super.ajoutCarteBase(carteCreatureBase);
	}

	@Override
	public boolean faireEvoluer(Carte carteCreatureInf, Carte carteCreatureSup) {
		// TODO Auto-generated method stub
		return super.faireEvoluer(carteCreatureInf, carteCreatureSup);
	}

	@Override
	public boolean ajoutEnergie(Carte carteEnergie) {
		// TODO Auto-generated method stub
		return super.ajoutEnergie(carteEnergie);
	}

	@Override
	public boolean utiliserCarteDresseur(Carte carteDresseur) {
		// TODO Auto-generated method stub
		return super.utiliserCarteDresseur(carteDresseur);
	}

	@Override
	public boolean battreRetraite(Carte carteCreatureRemplaçante) {
		// TODO Auto-generated method stub
		return super.battreRetraite(carteCreatureRemplaçante);
	}

	@Override
	public EList<Integer> attaquer() {
		// TODO Auto-generated method stub
		return super.attaquer();
	}

}
