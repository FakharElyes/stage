package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tn.esprit.spring.entities.WebOwner;
import tn.esprit.spring.services.WebOwnerService;

@Controller
public class IControllerWebOwner {

	@Autowired
	WebOwnerService iwebownerservice;

	public List<WebOwner> getAllvist() {
		return iwebownerservice.GetAllWebOwner();
	}

	public void DeleteWebOwner(Long webOwnerId) {
		iwebownerservice.DeleteWebOwner(webOwnerId);
	}

}
