package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureDTOMapper;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.entity.DresseurEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service.DresseurDTOMapper;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.entity.EnergieEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.service.EnergieDTOMapper;

@Service
public class CarteDTOMapperImpl implements CarteDTOMapper {

	public final CreatureDTOMapper creatureMapper = CreatureDTOMapper.INSTANCE;
	
	public final DresseurDTOMapper dresseurMapper = DresseurDTOMapper.INSTANCE;
	
	public final EnergieDTOMapper energieMapper = EnergieDTOMapper.INSTANCE;

	@Override
	public CarteDTO fromEntityToDTO(CarteEntity entity) {
		if(entity instanceof CreatureEntity) {
			return creatureMapper.fromEntityToDTO((CreatureEntity) entity);
		} else if(entity instanceof EnergieEntity) {
			return energieMapper.fromEntityToDTO((EnergieEntity) entity);
		} else if(entity instanceof DresseurEntity) {
			return dresseurMapper.fromEntityToDTO((DresseurEntity) entity);
		}
		throw new ClassCastException("Le type pour CarteEntity n'a pas pu être déterminé");
	}
	
}
