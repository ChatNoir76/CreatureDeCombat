package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import org.eclipse.emf.common.util.EList;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;

// This class overrides the generated class and will be instantiated by factory
public class CreatureImpl extends GenCreatureImpl implements Creature
{
	
	private void setBase(CreatureComponent newBase) {
		this.base = newBase;
		this.setPv(newBase.getPvInit());
	}

	private void setEvolution(CreatureComponent newEvolution) {
		this.evolution = newEvolution;
	}

	private void setMaitre(CreatureComponent newMaitre) {
		this.maitre = newMaitre;
	}
	
	@Override
	public void setPv(int newPv) {
		super.setPv(newPv < this.getPvInit() ? newPv : this.getPvInit());
	}

	@Override
	public void recoitDegat(int degat) {
		this.setPv(this.getPv() - degat);
	}

	@Override
	public void recoitSoin(int soin) {
		this.recoitDegat(-soin);
	}

	@Override
	public void initialize(CreatureComponent creatureComponent) {
		if(!hasInitialized()) {
			switch(creatureComponent.getNiveau()) {
			case BASE:
				this.setBase(creatureComponent);
				break;
			case EVOLUTION:
				this.setEvolution(creatureComponent);
				break;
			case MAITRE:
				this.setMaitre(creatureComponent);
				break;
			}
		}
	}

	@Override
	public boolean faireEvoluer(Creature creature) {
		if(this.estCompatibleEvolution(creature)) {
			CreatureComponent baseEvolution = creature.getActiveCreatureComponent();
			if(baseEvolution.getNiveau() == Niveau.EVOLUTION && this.getBase() != null && this.getEvolution() == null && this.getMaitre() == null) {
				this.setEvolution(baseEvolution);
				this.setPv(baseEvolution.getPvInit() - this.getBase().getPvInit() + this.getPv());
				return true;
			} else if(baseEvolution.getNiveau() == Niveau.MAITRE && this.getBase() != null && this.getEvolution() != null && this.getMaitre() == null) {
				this.setMaitre(baseEvolution);
				this.setPv(baseEvolution.getPvInit() - this.getEvolution().getPvInit() + this.getPv());
				return true;
			}
		}
		return false;
	}

	@Override
	public CreatureComponent getActiveCreatureComponent() {
		if(this.getMaitre() != null) {
			return this.getMaitre();
		} else if(this.getEvolution() != null) {
			return this.getEvolution();
		} else {
			return this.getBase();
		}
	}
	
	@Override
	public boolean estCompatibleEvolution(Creature creature) {
		CreatureComponent baseEvolution = creature.getActiveCreatureComponent().getBaseEvolution();
		CreatureComponent base = getActiveCreatureComponent();
		return base.equals(baseEvolution);
	}

	@Override
	public int getPvInit() {
		return getActiveCreatureComponent().getPvInit();
	}

	@Override
	public String getNom() {
		return getActiveCreatureComponent().getNom();
	}

	@Override
	public String getDescription() {
		return getActiveCreatureComponent().getDescription();
	}

	@Override
	public Categorie getCategorie() {
		return getActiveCreatureComponent().getCategorie();
	}

	@Override
	public EList<Attaque> getAttaques() {
		return getActiveCreatureComponent().getAttaques();
	}

	@Override
	public Degat getDegatDefense() {
		return getActiveCreatureComponent().getDegatDefense();
	}

	@Override
	public Niveau getNiveau() {
		return getActiveCreatureComponent().getNiveau();
	}

	@Override
	public boolean estMort() {
		return this.getPv() <= 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Creature || obj instanceof CreatureComponent) {
			return this.getNom().equals(((CreatureComponent) obj).getNom());
		}
		return false;
	}
}
