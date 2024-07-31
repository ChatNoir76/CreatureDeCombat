package fr.cnam.chatnoir76.creaturedecombat.ui.service;

public class ApplicationFactory {

	private ApplicationFactory() {};
	
	public static final CreatureDeCombat getAppDTO() {
		return new CreatureDeCombat();
	}
	
	public static final Joueur getJoueurDTO() {
		return new Joueur();
	}
	
}
