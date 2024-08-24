package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;

@Mapper(componentModel = "spring")
public interface CreatureDTOMapper {
	
	CreatureDTOMapper INSTANCE = Mappers.getMapper(CreatureDTOMapper.class);
	
	@Mapping(source = "pv", target = "pvInit")
	@Mapping(source = "categorie.nom", target = "categorie")
	@Mapping(source = "categorie.id", target = "categorieId")
	@Mapping(source = "niveau.nom", target = "niveau")
	@Mapping(source = "niveau.id", target = "niveauId")
	@Mapping(source = "creatureBase.nom", target = "nomCreatureBase")
	@Mapping(source = "creatureBase.id", target = "idCreatureBase")
	@Mapping(source = "attaques", target = "attaqueIds", qualifiedByName = "mapAttaquesToIds")
	@Mapping(target = "visible", ignore = true)
	public CarteCreatureDTO fromEntityToDTO(CreatureEntity entity);
	
	@Mapping(source = "pvInit", target = "pv")
	@Mapping(target = "categorie", ignore = true)
	@Mapping(target = "niveau", ignore = true)
	@Mapping(target = "creatureBase", ignore = true)
	@Mapping(target = "attaques", ignore = true)
	public CreatureEntity fromDTOToEntity(CarteCreatureDTO dto);
	
	@Named("mapAttaquesToIds")
    default List<Integer> mapAttaquesToIds(Set<AttaqueEntity> attaques) {
        return attaques.stream()
                       .map(AttaqueEntity::getId)
                       .collect(Collectors.toList());
    }
}
