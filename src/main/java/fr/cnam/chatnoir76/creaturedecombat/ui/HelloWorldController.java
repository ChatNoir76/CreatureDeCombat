package fr.cnam.chatnoir76.creaturedecombat.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.mapper.Mapper;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.provider.CreatureProvider;

@RestController
public class HelloWorldController {

	@Autowired
	EntityLinks el;
	
	@Autowired
	CreatureProvider provider;
	
	@GetMapping("/")
	public ModelAndView index() {
		Creature c = provider.getWorms();
		return new ModelAndView("index", "creature", Mapper.toDTO(c));
	}
}
