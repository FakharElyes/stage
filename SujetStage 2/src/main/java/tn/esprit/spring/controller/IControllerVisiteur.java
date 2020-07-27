package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.services.VisiteurService;

@Controller
public class IControllerVisiteur {

	@Autowired
	VisiteurService iVisiteurservice;

	public long addVisiteur(Visiteur visiteur, String siteWeb) {

		return iVisiteurservice.AddVisiteur(visiteur, siteWeb);

	}

	public List<Visiteur> getAllvist(WebOwner webowner) {
		return iVisiteurservice.GetAllVisiteurs(webowner);
	}

	public Visiteur GetVisiteurId(Long visiteurId) {
		return iVisiteurservice.GetVisiteurId(visiteurId);

	}

}
