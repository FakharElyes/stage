package tn.esprit.spring.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.repository.WebOwnerRepository;

@Service
public class WebOwnerServiceImp implements WebOwnerService {

	@Autowired
	WebOwnerRepository webOwnerRepository;

	public static final Logger l = LogManager.getLogger(WebOwnerServiceImp.class);
	
	@Override
	public long AddWebOwner(WebOwner webOwner) {
		webOwner.setVisited(0);
		webOwnerRepository.save(webOwner);
		return webOwner.getIdWebOwner();
	}

	public List<WebOwner> GetAllWebOwner() {
		return (List<WebOwner>) webOwnerRepository.findAll();
	}

	public void DeleteWebOwner(Long webOwnerId) {
		webOwnerRepository.deleteById(webOwnerId);

	}

	public void Visited(String  WebSite) {
		webOwnerRepository.UpdateVisited(WebSite);

	}
	
	@Override
	public void UpdateWebOwner(Long WebOwnerId, String siteWeb) {
		webOwnerRepository.UpdateSiteWeb(siteWeb, WebOwnerId);
	}

}
