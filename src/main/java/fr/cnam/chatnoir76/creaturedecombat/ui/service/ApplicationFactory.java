package fr.cnam.chatnoir76.creaturedecombat.ui.service;

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
	
}
