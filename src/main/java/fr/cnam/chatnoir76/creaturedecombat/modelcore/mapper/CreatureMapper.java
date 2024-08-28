package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.model.AbstractCreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class CreatureMapper {
	
	@Autowired
	DegatMapper degatMapper;
	
	@Autowired
	AttaqueMapper attaqueMapper;

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
		
		return CoreModelFactory.eINSTANCE.createCreature(absCreature);
		
		
		
	}
	
}
