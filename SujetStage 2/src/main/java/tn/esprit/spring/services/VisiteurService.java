package tn.esprit.spring.services;

import java.util.List;
import java.util.Date;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.entities.WebOwner;


public interface VisiteurService {
	
	public long AddVisiteur(Visiteur visiteur,String siteWeb);

	public List<Visiteur> GetAllVisiteurs(WebOwner webowner);

	public Visiteur GetVisiteurId(Long visiteurId);
	
	


}
