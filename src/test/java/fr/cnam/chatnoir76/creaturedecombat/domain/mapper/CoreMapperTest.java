package fr.cnam.chatnoir76.creaturedecombat.domain.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper.EnumerationMapper;

@SpringBootTest
public class CoreMapperTest {
	
	@Autowired
	EnumerationMapper enumMapper;
	
	@Test
	public void enumerationConversionTest() {
		assertEquals(Categorie.CLASSIQUE, CoreModelFactory.eINSTANCE.createCategorie(enumMapper.toDTO(Categorie.CLASSIQUE)));
		assertEquals(Categorie.ADORABLE, CoreModelFactory.eINSTANCE.createCategorie(enumMapper.toDTO(Categorie.ADORABLE)));
		assertEquals(Categorie.MAJESTUEUX, CoreModelFactory.eINSTANCE.createCategorie(enumMapper.toDTO(Categorie.MAJESTUEUX)));
		assertEquals(Categorie.MALEFIQUE, CoreModelFactory.eINSTANCE.createCategorie(enumMapper.toDTO(Categorie.MALEFIQUE)));
		assertEquals(Categorie.WHAT_THE_FUCK, CoreModelFactory.eINSTANCE.createCategorie(enumMapper.toDTO(Categorie.WHAT_THE_FUCK)));
		
		assertEquals(Niveau.BASE, CoreModelFactory.eINSTANCE.createNiveau(enumMapper.toDTO(Niveau.BASE)));
		assertEquals(Niveau.EVOLUTION, CoreModelFactory.eINSTANCE.createNiveau(enumMapper.toDTO(Niveau.EVOLUTION)));
		assertEquals(Niveau.MAITRE, CoreModelFactory.eINSTANCE.createNiveau(enumMapper.toDTO(Niveau.MAITRE)));

		assertEquals(CalculDegat.BASE, CoreModelFactory.eINSTANCE.createCalculDegat(enumMapper.toDTO(CalculDegat.BASE)));
		assertEquals(CalculDegat.RATIO, CoreModelFactory.eINSTANCE.createCalculDegat(enumMapper.toDTO(CalculDegat.RATIO)));
		
		assertEquals(TypeDegat.ATTAQUE, CoreModelFactory.eINSTANCE.createTypeDegat(enumMapper.toDTO(TypeDegat.ATTAQUE)));
		assertEquals(TypeDegat.DEFENSE, CoreModelFactory.eINSTANCE.createTypeDegat(enumMapper.toDTO(TypeDegat.DEFENSE)));
		
	}
}
