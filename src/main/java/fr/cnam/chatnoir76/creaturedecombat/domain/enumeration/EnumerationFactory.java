package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CalculDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.TypeDegatDTO;

public class EnumerationFactory {

	private EnumerationFactory() {};
	
	public static CategorieDTO createCategorieDTO(String id, String nom) {
		CategorieDTO categorie = new CategorieDTO();
		categorie.setId(id);
		categorie.setNom(nom);
		return categorie;
	}
	
	public static CalculDegatDTO createCalculDegatDTO(String id, String nom) {
		CalculDegatDTO calculDegat = new CalculDegatDTO();
		calculDegat.setId(id);
		calculDegat.setNom(nom);
		return calculDegat;
	}
	
	public static NiveauDTO createNiveauDTO(String id, String nom) {
		NiveauDTO niveau = new NiveauDTO();
		niveau.setId(id);
		niveau.setNom(nom);
		return niveau;
	}
	
	public static TypeDegatDTO createTypeDegatDTO(String id, String nom) {
		TypeDegatDTO typeDegat = new TypeDegatDTO();
		typeDegat.setId(id);
		typeDegat.setNom(nom);
		return typeDegat;
	}
	
}
