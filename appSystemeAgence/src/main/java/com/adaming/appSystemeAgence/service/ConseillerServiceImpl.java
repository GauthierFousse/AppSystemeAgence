package com.adaming.appSystemeAgence.service;

import java.util.List;

import com.adaming.appSystemeAgence.dao.IConseillerDao;
import com.adaming.appSystemeAgence.modele.Conseiller;


public class ConseillerServiceImpl implements IConseillerService {

	private IConseillerDao conseillerDao;
	
	/**
	 * Récupération de l'ensemble des conseillers sous forme de liste.
	 */
	public List<Conseiller> recupListeConseillers() {
		return conseillerDao.getAllConseiller();
	}
}
