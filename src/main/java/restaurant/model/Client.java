package restaurant.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Client")
public class Client extends Compte {

	@OneToMany(mappedBy="client")
	private List<Commande> histCommandes;
		
	public Client() {}

	public Client(Integer id, String username) {
		super(id,username);
	}

	public Client(String username) {
		super(username);
	}

	public List<Commande> getHistCommandes() {
		return histCommandes;
	}

	public void setHistCommandes(List<Commande> histCommandes) {
		this.histCommandes = histCommandes;
	}
	
	public void dateDerniereActivite() {
		//TODO avec DAOCommande
	}

}
