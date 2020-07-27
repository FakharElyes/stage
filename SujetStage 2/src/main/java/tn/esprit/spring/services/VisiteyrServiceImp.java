package tn.esprit.spring.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.repository.VisiteurRepository;
import tn.esprit.spring.repository.WebOwnerRepository;

@Service
public class VisiteyrServiceImp implements VisiteurService {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	@Autowired
	VisiteurRepository visiteurRepository;
	
	@Autowired
	WebOwnerRepository webOwnerRepisotory;

	public static final Logger l = LogManager.getLogger(WebOwnerServiceImp.class);
	

	public long AddVisiteur(Visiteur visiteur, String siteWeb) {
		visiteur.setX_row(null);
		visiteur.setY_row(null);
		visiteurRepository.save(visiteur);
		return visiteur.getIdVisiteur();
	}

	
	public List<Visiteur> GetAllVisiteurs(WebOwner webowner) {
		webOwnerRepisotory.save(webowner);
        return (List<Visiteur>) visiteurRepository.findAll();	
	}


	public Visiteur GetVisiteurId(Long visiteurId) {
		Visiteur visiteur = visiteurRepository.findById(visiteurId).orElse(null);
		l.info("retrive blog by id +++++;" + visiteur);
		return visiteur;
	}

	




}
