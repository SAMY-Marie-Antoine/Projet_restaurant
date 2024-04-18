package restaurant.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	//@JoinColumn(name="")
	private Client client;
	@OneToOne
	//@JoinColumn(name="")
	private Avis avis;
	//@JoinColumn(name="")
	@OneToMany
	//@JoinColumn(name="")
	private List<DetailCommande> detailCommandes;
	@Column(length=140)
	private String commentaire;
	@Column(nullable=false,columnDefinition="DATETIME")
	private LocalDateTime dateHeureCommande;
		
	public Commande() {	}

	public Commande(Integer id, Client client, Avis avis, List<DetailCommande> detailCommandes, String commentaire) {
		this.id = id;
		this.client = client;
		this.avis = avis;
		this.detailCommandes = detailCommandes;
		this.commentaire = commentaire;
		this.dateHeureCommande = LocalDateTime.now();
	}

	public Commande(Client client, Avis avis, List<DetailCommande> detailCommandes, String commentaire) {
		this.client = client;
		this.avis = avis;
		this.detailCommandes = detailCommandes;
		this.commentaire = commentaire;
		this.dateHeureCommande = LocalDateTime.now();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Avis getAvis() {
		return this.avis;
	}

	public void setAvis(Avis avis) {
		this.avis = avis;
	}

	public List<DetailCommande> getDetailCommandes() {
		return this.detailCommandes;
	}

	public void setDetailCommandes(List<DetailCommande> detailCommandes) {
		this.detailCommandes = detailCommandes;
	}

	public LocalDateTime getDateHeureCommande() {
		return this.dateHeureCommande;
	}

	public void setDateHeureCommande(LocalDateTime dateHeureCommande) {
		this.dateHeureCommande = dateHeureCommande;
	}

	//#Todo

	public double calculPrixTotal() {
		
		//List<DetailCommande>  lDCcmd = this.detailCommandes;
	    DetailCommande dCmd = new DetailCommande();
		
		double montant=0;
		int idx;
		for (idx = 0; idx < this.detailCommandes.size(); idx++) {
			dCmd  = this.detailCommandes.get(idx);
		
			montant=montant+ dCmd.getPrix();
		}
		return montant;
	
	}
}
