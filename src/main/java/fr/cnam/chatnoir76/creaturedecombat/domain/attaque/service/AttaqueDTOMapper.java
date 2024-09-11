package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity.DegatEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatDTOMapper;

@Mapper
public interface AttaqueDTOMapper {

	AttaqueDTOMapper INSTANCE = Mappers.getMapper(AttaqueDTOMapper.class);
	
	final DegatDTOMapper mapperDegat = DegatDTOMapper.INSTANCE;
	
	@Mapping(source = "ePrimaire", target = "energiePrimaire")
	@Mapping(source = "eSecondaire", target = "energieSecondaire")
	@Mapping(source = "categorie.nom", target = "categorie")
	@Mapping(source = "categorie.id", target = "categorieId")
	@Mapping(target = "degat", expression = "java(getShortDegatDescription(entity.getDegat()))")
	public AttaqueDTO fromEntityToDTO(AttaqueEntity entity);
	
	@InheritInverseConfiguration
	@Mapping(target = "degat", ignore = true)
	public AttaqueEntity fromDTOToEntity(AttaqueDTO dto);
	
	default DegatDTO getShortDegatDescription(DegatEntity entity) {
		return mapperDegat.fromEntityToDTO(entity);
	}
	
}
