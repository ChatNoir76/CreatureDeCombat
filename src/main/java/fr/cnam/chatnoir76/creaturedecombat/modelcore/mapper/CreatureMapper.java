package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.AbstractCreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class CreatureMapper {
	
	@Autowired
	DegatMapper degatMapper;
	
	@Autowired
	AttaqueMapper attaqueMapper;
	
	@Autowired
	EnumerationMapper enumMapper;

	public Creature toCore(CarteCreatureDTOFull dto) {
		
		if(dto == null) return null;
		
		AbstractCreatureComponent absCreature = CoreModelFactory.eINSTANCE.createCreatureComponent(dto);
		absCreature.setDegatDefense(degatMapper.toCore(dto.getDegatDefense()));
		absCreature.getAttaques().addAll(dto.getAttaques().stream().map(attdto -> attaqueMapper.toCore(attdto)).toList());
		
		if(absCreature instanceof Evolution) {
			((Evolution) absCreature).setBase(CoreModelFactory.eINSTANCE.createBase(dto.getCreatureBase()));
		} else if(absCreature instanceof Maitre) {
			((Maitre) absCreature).setEvolution(CoreModelFactory.eINSTANCE.createEvolution(dto.getCreatureBase()));
		}
		Creature creature = CoreModelFactory.eINSTANCE.createCreature(absCreature);
		return creature;
	}
	
	public CarteCreatureDTOFull toDTO(Creature creature) {
		if(creature == null) return null;
		
		Creature baseEvol = CoreModelFactory.eINSTANCE.createCreature(creature.getBaseEvolution());
		CarteCreatureDTOFull creatureBase = this.toDTO(baseEvol);
		CategorieDTO categorieDTO = enumMapper.toDTO(creature.getCategorie());
		NiveauDTO niveauDTO = enumMapper.toDTO(creature.getNiveau());
		
		CarteCreatureDTO dto = new CarteCreatureDTO();
		dto.setAttaqueIds(creature.getAttaques().stream().map(a -> a.getId()).toList());
		dto.setCategorie(categorieDTO.getNom());
		dto.setCategorieId(categorieDTO.getId());
		dto.setDescription(creature.getDescription());
		dto.setId(String.valueOf(creature.getId()));
		if(creatureBase != null) {
			dto.setIdCreatureBase(creatureBase.getIdCreatureBase());
			dto.setNomCreatureBase(creatureBase.getNom());
		}
		dto.setImage(null);
		dto.setNiveau(niveauDTO.getNom());
		dto.setNiveauId(niveauDTO.getId());
		dto.setNom(creature.getNom());
		dto.setPv(creature.getPv());
		dto.setPvInit(creature.getPvInit());
		dto.setVisible(false);
		CarteCreatureDTOFull full = new CarteCreatureDTOFull(dto);
		full.setDegatDefense(degatMapper.toDTO(creature.getDegatDefense()));
		full.setCreatureBase(creatureBase);
		full.setAttaques(creature.getAttaques().stream().map(a -> attaqueMapper.toDTO(a)).toList());
		return full;
	}
	
}
