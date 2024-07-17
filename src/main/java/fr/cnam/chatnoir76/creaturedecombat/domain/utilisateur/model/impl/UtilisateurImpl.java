package fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.Utilisateur;

// This class overrides the generated class and will be instantiated by factory
public class UtilisateurImpl extends GenUtilisateurImpl implements Utilisateur
{

	@Override
	public boolean checkPassword(String password) {
		return true;
	}

}
