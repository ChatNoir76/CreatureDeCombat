package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;

@Mapper
public interface AttaqueDTOMapper {

	AttaqueDTOMapper INSTANCE = Mappers.getMapper(AttaqueDTOMapper.class);
	
	@Mapping(source = "ePrimaire", target = "energiePrimaire")
	@Mapping(source = "eSecondaire", target = "energieSecondaire")
	@Mapping(source = "categorie.nom", target = "categorie")
	@Mapping(target = "degat", expression = "java(getShortDegatDescription(entity.getDegat().getTypeDegat().getNom(), entity.getDegat().getDegat(), entity.getDegat().getCalculdegat().getNom()))")
	public AttaqueDTO fromEntityToDTO(AttaqueEntity entity);
	
	@InheritInverseConfiguration
	@Mapping(target = "degat", ignore = true)
	public AttaqueEntity fromDTOToEntity(AttaqueDTO dto);
	
	default String getShortDegatDescription(String type, int degat, String mode) {
		StringBuilder s = new StringBuilder(type.equals("ATTAQUE") ? "-" : "+");
		s.append(degat);
		s.append(mode.equals("BASE") ? "pv" : "%");
		return s.toString();
	}
	
}
