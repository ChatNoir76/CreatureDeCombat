package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;

// This class overrides the generated class and will be instantiated by factory
public class CreatureImpl extends GenCreatureImpl implements Creature
{

	@Override
	public void setPv(int newPv) {
		super.setPv(newPv > this.getPvInit() ? this.getPvInit() : newPv);
	}

	@Override
	public boolean estCompatibleEvolution(Creature creature) {
		return this.equals(creature.getBase());
	}

	@Override
	public void faireEvoluer(Creature creature) {
		this.base = this;
		this.attaques.clear();
		
		this.nom = creature.getNom();
		this.description = creature.getDescription();
		this.attaques = creature.getAttaques();
		this.pvInit = creature.getPvInit();
		this.pv = creature.getPvInit() - this.base.getPvInit() + this.base.getPv();
		this.categorie = creature.getCategorie();
		this.degatDefense = creature.getDegatDefense();
	}

	@Override
	public Niveau getNiveau() {
		if(this.base == null) {
			return Niveau.BASE;
		} else {
			if(this.base.getNiveau().equals(Niveau.BASE)) {
				return Niveau.EVOLUTION;
			} else {
				return Niveau.MAITRE;
			}
		}
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
