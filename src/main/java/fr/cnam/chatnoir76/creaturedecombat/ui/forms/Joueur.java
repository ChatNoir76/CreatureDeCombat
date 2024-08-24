package fr.cnam.chatnoir76.creaturedecombat.ui.forms;

import org.springframework.hateoas.RepresentationModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Joueur extends RepresentationModel<Joueur> {

	@NotBlank(message = "champ obligatoire")
	@Size(max=15)
	private String pseudo1 = "j1";
	
	@NotNull
	private int deckId1 = -1;

	@NotBlank(message = "champ obligatoire")
	@Size(max=15)
	private String pseudo2 = "j2";
	
	@NotNull
	private int deckId2 = -1;

	public String getPseudo1() {
		return pseudo1;
	}

	public void setPseudo1(String pseudo1) {
		this.pseudo1 = pseudo1;
	}

	public int getDeckId1() {
		return deckId1;
	}

	public void setDeckId1(int deckId1) {
		this.deckId1 = deckId1;
	}

	public String getPseudo2() {
		return pseudo2;
	}

	public void setPseudo2(String pseudo2) {
		this.pseudo2 = pseudo2;
	}

	public int getDeckId2() {
		return deckId2;
	}

	public void setDeckId2(int deckId2) {
		this.deckId2 = deckId2;
	}
	
}
