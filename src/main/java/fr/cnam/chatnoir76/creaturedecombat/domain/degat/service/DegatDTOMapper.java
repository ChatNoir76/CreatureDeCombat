package fr.cnam.chatnoir76.creaturedecombat.domain.degat.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity.DegatEntity;

@Mapper
public interface DegatDTOMapper {

	DegatDTOMapper INSTANCE = Mappers.getMapper(DegatDTOMapper.class);
	
	@Mapping(source = "dprecision", target = "precision")
	@Mapping(source = "drattage", target = "rattage")
	@Mapping(source = "typeDegat.nom", target = "type")
	@Mapping(source = "calculdegat.nom", target = "mode")
	public DegatDTO fromEntityToDTO(DegatEntity entity);
	
	@InheritInverseConfiguration
	@Mapping(target = "id", ignore = true)
	public DegatEntity fromDTOToEntity(DegatDTO dto);
	
}
