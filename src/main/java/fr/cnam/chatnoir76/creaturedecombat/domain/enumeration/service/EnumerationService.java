package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import java.util.List;


public interface EnumerationService<T> {

	T getById(String id);
	
	T getByName(String nom);
	
	List<T> getAll();
	
}
