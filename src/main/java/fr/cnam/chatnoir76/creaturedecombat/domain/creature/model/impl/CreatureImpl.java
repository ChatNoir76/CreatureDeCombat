package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import org.eclipse.emf.common.util.EList;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;

// This class overrides the generated class and will be instantiated by factory
public class CreatureImpl extends GenCreatureImpl implements Creature
{

	@Override
	public void setPv(int newPv) {
		// TODO Auto-generated method stub
		super.setPv(newPv);
	}

	@Override
	public int getPvInit() {
		// TODO Auto-generated method stub
		return super.getPvInit();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	@Override
	public Categorie getCategorie() {
		// TODO Auto-generated method stub
		return super.getCategorie();
	}

	@Override
	public EList<Attaque> getAttaques() {
		// TODO Auto-generated method stub
		return super.getAttaques();
	}

	@Override
	public Degat getDegatDefense() {
		// TODO Auto-generated method stub
		return super.getDegatDefense();
	}

	@Override
	public boolean estCompatibleEvolution(Creature creature) {
		return this.equals(null);
	}

	@Override
	public void faireEvoluer(Creature creature) {
		
//		this.attaques.clear();
//		
//		this.nom = creature.getNom();
//		this.description = creature.getDescription();
//		this.attaques = creature.getAttaques();
//		this.pvInit = creature.getPvInit();
//		this.pv = creature.getPvInit() - this.base.getPvInit() + this.base.getPv();
//		this.categorie = creature.getCategorie();
//		this.degatDefense = creature.getDegatDefense();
	}

	@Override
	public Niveau getNiveau() {
		return Niveau.BASE;
	}

	@Override
	public boolean estMort() {
		return this.pv <= 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Creature) {
			return this.getNom().equals(((Creature) obj).getNom());
		}
		return false;
	}
}
