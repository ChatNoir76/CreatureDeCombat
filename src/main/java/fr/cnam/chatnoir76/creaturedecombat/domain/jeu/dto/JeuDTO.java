package fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTOFull;

public class JeuDTO  extends RepresentationModel<JeuDTO> {
	
	private String pseudo;

	private DeckDTOFull deck;
	
	private CarteCreatureDTOFull creatureActive;
	
	private List<CarteDTO> pileDefausse;
	
	private List<CarteDTO> main;
	
	private List<CarteCreatureDTOFull> banc;
	
	private List<CarteDTO> recompense;
	
	public JeuDTO(String joueur, DeckDTOFull carteDeck) {
		this.pseudo = joueur;
		this.deck = carteDeck;
		this.pileDefausse = new ArrayList<CarteDTO>();
		this.main = new ArrayList<CarteDTO>();
		this.recompense = new ArrayList<CarteDTO>();
		this.banc = new ArrayList<CarteCreatureDTOFull>();
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public DeckDTOFull getDeck() {
		return deck;
	}

	public void setDeck(DeckDTOFull deck) {
		this.deck = deck;
	}

	public CarteCreatureDTOFull getCreatureActive() {
		return creatureActive;
	}

	public void setCreatureActive(CarteCreatureDTOFull creatureActive) {
		this.creatureActive = creatureActive;
	}

	public List<CarteDTO> getPileDefausse() {
		return pileDefausse;
	}

	public void setPileDefausse(List<CarteDTO> pileDefausse) {
		this.pileDefausse = pileDefausse;
	}

	public List<CarteDTO> getMain() {
		return main;
	}

	public void setMain(List<CarteDTO> main) {
		this.main = main;
	}

	public List<CarteCreatureDTOFull> getBanc() {
		return banc;
	}

	public void setBanc(List<CarteCreatureDTOFull> banc) {
		this.banc = banc;
	}

	public List<CarteDTO> getRecompense() {
		return recompense;
	}

	public void setRecompense(List<CarteDTO> recompense) {
		this.recompense = recompense;
	}
	
	
	
}
