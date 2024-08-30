package fr.cnam.chatnoir76.creaturedecombat.ui.service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.CreatureCreateForm;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.Joueur;

public class ApplicationFactory {

	private ApplicationFactory() {};
	
	public static final CreatureDeCombat createAppDTO() {
		return new CreatureDeCombat();
	}
	
	public static final Joueur createJoueurDTO() {
		return new Joueur();
	}
	
	public static final CarteCreatureDTO createEmptyCreature() {
		CarteCreatureDTO creature = new CarteCreatureDTO();
		creature.setId("-1");
		return creature;
	}
	
	public static final CreatureCreateForm createCreatureCreateForm() {
		CreatureCreateForm form = new CreatureCreateForm();
		form.setPv(30);
		return form;
	}
	
	public static final CreatureCreateForm createCreatureCreateForm(CarteCreatureDTO creature) {
		CreatureCreateForm form = ApplicationFactory.createCreatureCreateForm();
		form.setId(creature.getId());
		form.setNom(creature.getNom());
		form.setDescription(creature.getDescription());
		form.setImage(creature.getImage());
		form.setPv(creature.getPvInit());
		form.setNiveauId(creature.getNiveauId());
		form.setCreatureBaseId(creature.getIdCreatureBase());
		form.setAttaques(creature.getAttaqueIds());
		form.setCategorieId(creature.getCategorieId());
		return form;
	}
	
}
