package restaurant.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="avis")
public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 250, nullable=false)
	private String avis;
	@ManyToOne
	@JoinColumn(name="id_client",nullable=false)
	private Client client;
	@OneToOne
	@JoinColumn(name="id_commande",nullable=false)
	private Commande commande;
	@Column(nullable=false)
	private LocalDateTime dateHeure;
	
	public Avis() {}

	public Avis(Integer id, String avis, Client client, Commande commande, LocalDateTime dateHeure) {
		this.id = id;
		this.avis = avis;
		this.client = client;
		this.commande = commande;
		this.dateHeure = LocalDateTime.now();
	}

	public Avis(String avis, Client client, Commande commande, LocalDateTime dateHeure) {
		this.avis = avis;
		this.client = client;
		this.commande = commande;
		this.dateHeure = LocalDateTime.now();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateHeure() {
		return this.dateHeure;
	}

	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
