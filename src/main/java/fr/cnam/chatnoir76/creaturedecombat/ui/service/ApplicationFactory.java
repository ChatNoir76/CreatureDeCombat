package fr.cnam.chatnoir76.creaturedecombat.ui.service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.CreatureCreateForm;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.Joueur;

public class ApplicationFactory {

	private ApplicationFactory() {};
	
	public static final CreatureDeCombat getAppDTO() {
		return new CreatureDeCombat();
	}
	
	public static final Joueur getJoueurDTO() {
		return new Joueur();
	}
	
	public static final CreatureCreateForm getCreatureCreateForm() {
		return new CreatureCreateForm();
	}
	
	public static final CreatureCreateForm getCreatureCreateForm(CarteCreatureDTO creature) {
		CreatureCreateForm form = new CreatureCreateForm();
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
