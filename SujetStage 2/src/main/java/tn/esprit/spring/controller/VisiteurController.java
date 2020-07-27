package tn.esprit.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Visiteur;
import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.services.VisiteurService;


@RestController
public class VisiteurController {
	
	@Autowired
	VisiteurService visiteurService;
	Visiteur v = new Visiteur();
	
	@GetMapping("/retrieve-all-visiteurs")
	@ResponseBody
	public List<Visiteur> getVisiteur(WebOwner webowner) {
		List<Visiteur> list = visiteurService.GetAllVisiteurs(webowner);
		return list;
	}
	
	
	@PostMapping("/add-visiteurs")
	@ResponseBody
	public Visiteur saveVisiteur(@RequestBody Visiteur visiteur, String siteWeb,WebOwner webowner) {
		visiteurService.AddVisiteur(visiteur,siteWeb);
		return visiteur;
	

	
}
	



}
