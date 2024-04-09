package restaurant.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends Compte {

	@OneToMany(mappedBy="commandes")
	private List<Commande> histCommandes;
	
	public Client() {}

	public List<Commande> getHistCommandes() {
		return histCommandes;
	}

	public void setHistCommandes(List<Commande> histCommandes) {
		this.histCommandes = histCommandes;
	}
	
	public void dateDerniereActivie() {
		//TODO avec DAOCommande
	}

}
