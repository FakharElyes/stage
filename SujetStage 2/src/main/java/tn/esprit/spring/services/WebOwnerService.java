package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.WebOwner;

public interface WebOwnerService {

	public long AddWebOwner(WebOwner webOwner);

	public List<WebOwner> GetAllWebOwner();
	
	public void UpdateWebOwner(Long WebOwnerId, String siteWeb);

	public void DeleteWebOwner(Long webOwnerId);

	public void Visited(String WebSite);

}
