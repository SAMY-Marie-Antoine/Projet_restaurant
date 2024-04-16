package restaurant.model;

import javax.persistence.Entity;

@Entity
public class Gestionnaire extends Compte{

	public Gestionnaire() {}
	
	public void supprimerClientsObsoletes() {
		//TODO WHEN DAOClient
	};
	
	public void supprimerCommandesObsoletes() {
		//TODO WHEN DAOCommandes
	};
}
