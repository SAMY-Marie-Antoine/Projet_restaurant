package restaurant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length = 35 )
	@ManyToOne
	private Client client;
	@Column
	private String commentaire;
	@Column
	private List<Formule> formules=new ArrayList();
	@Column
	private List<Produit> produits=new ArrayList();

	//private LocalDate date_commande;

	public Commande() {
		// TODO Auto-generated constructor stub
	}



	//#Todo

	public double calculPrixTotal() {
		double montant=0;
		for(Formule f : formules) {
			montant=montant+ f.getPrix();
		}
		for(Produit p : produits) {
			montant=montant+ p.getPrix();
		}

		return montant;
	}

}
