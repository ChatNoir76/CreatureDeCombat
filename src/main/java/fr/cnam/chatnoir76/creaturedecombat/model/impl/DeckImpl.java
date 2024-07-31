package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import java.util.Random;

import org.eclipse.emf.common.util.EList;

import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;

// This class overrides the generated class and will be instantiated by factory
public class DeckImpl extends GenDeckImpl implements Deck
{

	private int getRandomIndex(int taille) {
		Random random = new Random();
		int lowValue = 0;
		return random.nextInt(taille - lowValue) + lowValue;
	}
	
	@Override
	public Carte piocher() {
		int index = getRandomIndex(this.cartes.size());
		Carte carte = cartes.get(index);
		cartes.remove(index);
		return carte;
	}

	@Override
	public EList<Carte> getCreatureBase() {
		// TODO Auto-generated method stub
		return super.getCreatureBase();
	}

	@Override
	public EList<Carte> getCreatureEvolution() {
		// TODO Auto-generated method stub
		return super.getCreatureEvolution();
	}

	@Override
	public EList<Carte> getEnergie() {
		// TODO Auto-generated method stub
		return super.getEnergie();
	}

	@Override
	public EList<Carte> getObjet() {
		// TODO Auto-generated method stub
		return super.getObjet();
	}

	@Override
	public EList<Carte> getSupporteur() {
		// TODO Auto-generated method stub
		return super.getSupporteur();
	}

}
