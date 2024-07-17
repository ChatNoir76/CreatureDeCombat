package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.provider.CreatureProvider;

public class CombatTest {

	@Autowired
	CreatureProvider provider;
	
	@Test
	public void attaqueTest() {
		
		Creature c1 = provider.getWorms();
		Creature c2 = provider.getWorms();
		
		c1.getAttaques().get(0).attaque(c1, c2);
		
		assertEquals(c1.getPv(), c1.getPvInit());
		assertNotEquals(c2.getPv(), c2.getPvInit());
		
		
	}
	
}
