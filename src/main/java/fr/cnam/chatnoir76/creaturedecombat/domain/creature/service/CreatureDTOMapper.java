package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;

@Mapper
public interface CreatureDTOMapper {

	CreatureDTOMapper INSTANCE = Mappers.getMapper(CreatureDTOMapper.class);
	
	@Mapping(source = "pv", target = "pvInit")
	@Mapping(source = "categorie.nom", target = "categorie")
	@Mapping(source = "niveau.nom", target = "niveau")
	@Mapping(source = "creatureBase.nom", target = "nomCreatureBase")
	@Mapping(target = "visible", ignore = true)
	public CarteCreatureDTO fromEntityToDTO(CreatureEntity entity);
	
	@InheritInverseConfiguration
	public CreatureEntity fromDTOToEntity(CarteCreatureDTO dto);
	
}
