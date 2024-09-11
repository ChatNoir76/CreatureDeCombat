package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CalculDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.TypeDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;

@Service
public class EnumerationMapper {
	
	public CategorieDTO toDTO(Categorie categorie) {
		CategorieDTO dto = new CategorieDTO();
		dto.setNom(categorie.getLiteral());
		dto.setId(String.valueOf(categorie.getValue() + 2));
		return dto;
	}
	
	public CalculDegatDTO toDTO(CalculDegat calculDegat) {
		CalculDegatDTO dto = new CalculDegatDTO();
		dto.setNom(calculDegat.getLiteral());
		dto.setId(String.valueOf(calculDegat.getValue() + 1));
		return dto;
	}
	
	public NiveauDTO toDTO(Niveau niveau) {
		NiveauDTO dto = new NiveauDTO();
		dto.setNom(niveau.getLiteral());
		dto.setId(String.valueOf(niveau.getValue() + 1));
		return dto;
	}
	
	public TypeDegatDTO toDTO(TypeDegat typeDegat) {
		TypeDegatDTO dto = new TypeDegatDTO();
		dto.setNom(typeDegat.getLiteral());
		dto.setId(typeDegat.getValue() == 1 ? "1" : "2");
		return dto;
	}
}
