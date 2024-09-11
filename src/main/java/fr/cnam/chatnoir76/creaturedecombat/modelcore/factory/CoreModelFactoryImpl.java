package fr.cnam.chatnoir76.creaturedecombat.modelcore.factory;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CalculDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.TypeDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.AbstractCreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.impl.ModelFactoryImpl;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.provider.DegatProvider;

public class CoreModelFactoryImpl extends ModelFactoryImpl implements CoreModelFactory {
	
	public static CoreModelFactory init() {
		try {
			Object fact = ModelFactoryImpl.init();
			if ((fact != null) && (fact instanceof CoreModelFactory))
					return (CoreModelFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreModelFactoryImpl(); 
	}
	
	private AbstractCreatureComponent createCreatureComponent(Niveau niveau) {
		if(niveau == Niveau.BASE) return this.createBase();
		if(niveau == Niveau.MAITRE) return this.createEvolution();
		return this.createMaitre();
	}
	
	private Degat getDegatDefense(Categorie categorie) {
		switch(categorie) {
			case CLASSIQUE :
				return DegatProvider.getDefenseClassique();
			case ADORABLE : 
				return DegatProvider.getDefenseAdorable();
			case MAJESTUEUX :
				return DegatProvider.getDefenseMajestueux();
			case MALEFIQUE : 
				return DegatProvider.getDefenseMalefique();
			case WHAT_THE_FUCK : 
				return DegatProvider.getDefenseWhatTheFuck();
			default :
				return null;
		}
		
	}
	
	@Override
	public Categorie createCategorie(CategorieDTO dto) {
		return this.createCategorie(dto.getNom());
	}
	
	private Categorie createCategorie(String categorie) {
		if(categorie.toLowerCase().equals(Categorie.ADORABLE.getLiteral().toLowerCase())) {
			return Categorie.ADORABLE;
		} else if(categorie.toLowerCase().equals(Categorie.CLASSIQUE.getLiteral().toLowerCase())) {
			return Categorie.CLASSIQUE;
		} else if(categorie.toLowerCase().equals(Categorie.MAJESTUEUX.getLiteral().toLowerCase())) {
			return Categorie.MAJESTUEUX;
		} else if(categorie.toLowerCase().equals(Categorie.MALEFIQUE.getLiteral().toLowerCase())) {
			return Categorie.MALEFIQUE;
		} else {
			return Categorie.WHAT_THE_FUCK;
		}
	}
	
	@Override
	public Niveau createNiveau(NiveauDTO dto) {
		return this.createNiveau(dto.getNom());
	}
	
	private Niveau createNiveau(String niveau) {
		if(niveau.toLowerCase().equals(Niveau.BASE.getLiteral().toLowerCase())) {
			return Niveau.BASE;
		} else if(niveau.toLowerCase().equals(Niveau.EVOLUTION.getLiteral().toLowerCase())) {
			return Niveau.EVOLUTION;
		} else {
			return Niveau.MAITRE;
		}
	}
	
	@Override
	public CalculDegat createCalculDegat(CalculDegatDTO dto) {
		return this.createCalculDegat(dto.getNom());
	}
	
	private CalculDegat createCalculDegat(String calculDegat) {
		if(calculDegat.toLowerCase().equals(CalculDegat.BASE.getLiteral().toLowerCase())) {
			return CalculDegat.BASE;
		} else {
			return CalculDegat.RATIO;
		}
	}
	
	@Override
	public TypeDegat createTypeDegat(TypeDegatDTO dto) {
		return this.createTypeDegat(dto.getNom());
	}
	
	private TypeDegat createTypeDegat(String typeDegat) {
		if(typeDegat.toLowerCase().equals(TypeDegat.ATTAQUE.getLiteral().toLowerCase())) {
			return TypeDegat.ATTAQUE;
		} else {
			return TypeDegat.DEFENSE;
		}
	}
	
	@Override
	public Degat createDegat(DegatDTO dto) {
		Degat degat = this.createDegat();
		degat.setId(Integer.valueOf(dto.getId()));
		degat.setChanceRattage(dto.getRattage());
		degat.setIncertitude(dto.getPrecision());
		degat.setDegat(dto.getDegat());
		degat.setType(this.createTypeDegat(dto.getType()));
		degat.setModeCalcul(this.createCalculDegat(dto.getMode()));
		return degat;
	}
	
	@Override
	public Attaque createAttaque(AttaqueDTO dto) {
		Attaque attaque = this.createAttaque();
		attaque.setId(Integer.valueOf(dto.getId()));
		attaque.setNom(dto.getNom());
		attaque.setDescription(dto.getDescription());
		attaque.setCategorie(this.createCategorie(dto.getCategorie()));
		attaque.setBesoinEnergieAutre(dto.getEnergieSecondaire());
		attaque.setBesoinEnergieCategorie(dto.getEnergiePrimaire());
		return attaque;
	}
	
	@Override
	public Energie createEnergie(CarteEnergieDTO dto) {
		Energie energie = this.createEnergie(this.createCategorie(dto.getCategorie()));
		energie.setId(Integer.valueOf(dto.getId()));
		energie.setNom(dto.getNom());
		energie.setDescription(dto.getDescription());
		return energie;
	}
	
	@Override
	public Dresseur createDresseur(CarteDresseurDTO dto) {
		Dresseur dresseur = this.createObjet();
		dresseur.setId(Integer.valueOf(dto.getId()));
		dresseur.setNom(dto.getNom());
		dresseur.setDescription(dto.getDescription());
		return dresseur;
	}
	
	@Override
	public Deck createDeck(DeckDTO dto) {
		Deck deck = this.createDeck();
		deck.setId(Integer.valueOf(dto.getId()));
		deck.setNom(dto.getNom());
		deck.setDescription(dto.getDescription());
		return deck;
	}

	@Override
	public AbstractCreatureComponent createCreatureComponent(CarteCreatureDTO dto) {
		AbstractCreatureComponent comp = this.createCreatureComponent(this.createNiveau(dto.getNiveau()));
		comp.setId(Integer.valueOf(dto.getId()));
		comp.setNom(dto.getNom());
		comp.setDescription(dto.getDescription());
		comp.setPv(dto.getPv());
		comp.setPvInit(dto.getPvInit());
		comp.setCategorie(this.createCategorie(dto.getCategorie()));
		comp.setDegatDefense(this.getDegatDefense(comp.getCategorie()));
		return comp;
	}

	@Override
	public Base createBase(CarteCreatureDTO dto) {
		Base base = this.createBase();
		base.setId(Integer.valueOf(dto.getId()));
		base.setPv(dto.getPv());
		base.setNom(dto.getNom());
		base.setDescription(dto.getDescription());
		base.setPvInit(dto.getPvInit());
		base.setCategorie(this.createCategorie(dto.getCategorie()));
		return base;
	}

	@Override
	public Evolution createEvolution(CarteCreatureDTO dto) {
		Evolution evolution = this.createEvolution();
		evolution.setId(Integer.valueOf(dto.getId()));
		evolution.setPv(dto.getPv());
		evolution.setNom(dto.getNom());
		evolution.setDescription(dto.getDescription());
		evolution.setPvInit(dto.getPvInit());
		evolution.setCategorie(this.createCategorie(dto.getCategorie()));
		return evolution;
	}

	@Override
	public Maitre createMaitre(CarteCreatureDTO dto) {
		Maitre maitre = this.createMaitre();
		maitre.setId(Integer.valueOf(dto.getId()));
		maitre.setPv(dto.getPv());
		maitre.setNom(dto.getNom());
		maitre.setDescription(dto.getDescription());
		maitre.setPvInit(dto.getPvInit());
		maitre.setCategorie(this.createCategorie(dto.getCategorie()));
		return maitre;
	}

	@Override
	public Jeu createJeu(JeuDTO dto) {
		Jeu jeu = this.createJeu();
		jeu.setPseudo(dto.getPseudo());
		return jeu;
	}
	
}
