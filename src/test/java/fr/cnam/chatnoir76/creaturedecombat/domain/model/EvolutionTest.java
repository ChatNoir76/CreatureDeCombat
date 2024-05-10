package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class EvolutionTest {
	
	private Creature cBase;
	private Creature cEvolution;
	private Creature cMaitre;
	private Creature cNonCompatible;
	private Creature cEmpty;
	
	@BeforeEach
	public void beforeEach() {
		Base base = ModelFactory.eINSTANCE.createBase();
		base.setNom("Creature_Base_Nom");
		base.setDescription("Creature_Base_Description");
		base.setPvInit(30);
		base.setCategorie(Categorie.ADORABLE);
		
		Evolution evolution = ModelFactory.eINSTANCE.createEvolution();
		evolution.setNom("Creature_Evolution_Nom");
		evolution.setDescription("Creature_Evolution_Description");
		evolution.setPvInit(100);
		evolution.setCategorie(Categorie.ADORABLE);
		evolution.setBase(base);
		
		Maitre maitre = ModelFactory.eINSTANCE.createMaitre();
		maitre.setNom("Creature_Maitre_Nom");
		maitre.setDescription("Creature_Maitre_Description");
		maitre.setPvInit(180);
		maitre.setCategorie(Categorie.ADORABLE);
		maitre.setEvolution(evolution);
		
		Evolution evolutionnc = ModelFactory.eINSTANCE.createEvolution();
		evolutionnc.setNom("Creature_autre_Nom");
		evolutionnc.setDescription("Creature_autre_Description");
		evolutionnc.setPvInit(200);
		evolutionnc.setCategorie(Categorie.ADORABLE);
		evolutionnc.setBase(ModelFactory.eINSTANCE.createBase());
		
		cBase = ModelFactory.eINSTANCE.createCreature(base.getActiveCreatureComponent());
		cEvolution = ModelFactory.eINSTANCE.createCreature(evolution.getActiveCreatureComponent());
		cMaitre = ModelFactory.eINSTANCE.createCreature(maitre.getActiveCreatureComponent());
		cNonCompatible = ModelFactory.eINSTANCE.createCreature(evolutionnc.getActiveCreatureComponent());
		cEmpty = ModelFactory.eINSTANCE.createCreature(ModelFactory.eINSTANCE.createDefaultBase().getActiveCreatureComponent());
	}
	
	private void verificationAttributs(Creature creature, Creature cc) {
		assertTrue(creature.getNiveau().equals(cc.getNiveau()), "Le niveau est %s au lieu de %s".formatted(creature.getNiveau(), cc.getNiveau()));
		assertTrue(creature.getNom().equals(cc.getNom()), "Le nom est %s au lieu de %s".formatted(creature.getNom(), cc.getNom()));
		assertTrue(creature.getDescription().equals(cc.getDescription()), "La description est %s au lieu de %s".formatted(creature.getDescription(), cc.getDescription()));		
		assertTrue(creature.getPvInit() == cc.getPvInit(), "Les PVinit sont de %d au lieu de %d".formatted(creature.getPv(), cc.getPvInit()));
		assertTrue(creature.getCategorie().equals(cc.getCategorie()), "La catégorie est %s au lieu de %s".formatted(creature.getCategorie(), cc.getCategorie()));
		creature.getAttaques().forEach(a -> {
			assertTrue(cc.getAttaques().contains(a), "L'attaque est manquante : %s".formatted(a.getNom()));
		});
	}
	
	@Test
	public void InitializationTest() {
		assertFalse(ModelFactory.eINSTANCE.createCreature().hasInitialized());
		assertTrue(cEmpty.hasInitialized());
		assertTrue(cBase.hasInitialized());
		assertTrue(cEvolution.hasInitialized());
		assertTrue(cMaitre.hasInitialized());
		assertTrue(cNonCompatible.hasInitialized());
	}
	
	@Test
	public void baseVersEvolutionTest() {
		Creature creature = cBase;
		verificationAttributs(creature, cBase);
		
		assertFalse(creature.faireEvoluer(cEmpty));
		verificationAttributs(creature, cBase);
		
		assertFalse(creature.faireEvoluer(cNonCompatible));
		verificationAttributs(creature, cBase);
		
		assertFalse(creature.faireEvoluer(cBase));
		verificationAttributs(creature, cBase);
		
		assertFalse(creature.faireEvoluer(cMaitre));
		verificationAttributs(creature, cBase);
		
		assertTrue(creature.faireEvoluer(cEvolution));
		verificationAttributs(creature, cEvolution);
	}
	
	@Test
	public void evolutionVersMaitreTest() {
		Creature creature = cEvolution;
		verificationAttributs(creature, cEvolution);
		
		assertFalse(creature.faireEvoluer(cEmpty));
		verificationAttributs(creature, cEvolution);
		
		assertFalse(creature.faireEvoluer(cNonCompatible));
		verificationAttributs(creature, cEvolution);
		
		assertFalse(creature.faireEvoluer(cBase));
		verificationAttributs(creature, cEvolution);
		
		assertFalse(creature.faireEvoluer(cEvolution));
		verificationAttributs(creature, cEvolution);
		
		assertFalse(creature.faireEvoluer(cMaitre));
		verificationAttributs(creature, cEvolution);
	}
	
	@Test
	public void baseVersMaitreTest() {
		Creature creature = cBase;
		verificationAttributs(creature, cBase);
		
		assertTrue(creature.faireEvoluer(cEvolution));
		verificationAttributs(creature, cEvolution);
		
		assertTrue(creature.faireEvoluer(cMaitre));
		verificationAttributs(creature, cMaitre);
	}
	
	@Test
	public void notInitializedVersMaitreTest() {
		Creature creature = ModelFactory.eINSTANCE.createCreature();
		verificationAttributs(creature, cEmpty);
		
		assertFalse(creature.faireEvoluer(cNonCompatible));
		verificationAttributs(creature, cEmpty);
		
		assertFalse(creature.faireEvoluer(cBase));
		verificationAttributs(creature, cEmpty);
		
		assertFalse(creature.faireEvoluer(cMaitre));
		verificationAttributs(creature, cEmpty);
		
		assertFalse(creature.faireEvoluer(cEvolution));
		verificationAttributs(creature, cEmpty);
	}
	
}
