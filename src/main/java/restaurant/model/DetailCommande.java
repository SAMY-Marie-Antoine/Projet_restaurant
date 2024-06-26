package restaurant.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonView;

import restaurant.view.Views;


@Entity
@Table(name="detailCommande")
public class DetailCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Common.class)
	private Integer id;
	@Column(nullable = false )
	@JsonView(Views.Common.class)
	private double prix;
	@Column
	private int qty;
	@JoinColumn(nullable = false )
	@JsonView(Views.Common.class)
	@ManyToOne
	private Commande commande;
	@Column(nullable = false )
	@JsonView(Views.Common.class)
	@ManyToOne
	private Produit produit;

	@Column
	private boolean dansFormule;
	@Enumerated(EnumType.STRING)
	@Column(name="type_produit",nullable = false, columnDefinition = "ENUM('Entree','Plat','Dessert','Boisson')")
	private TypeProduit type;
	@Column(nullable = false )
	@JsonView(Views.Common.class)
	private String libelleFormule;
		
	
	
	public DetailCommande() {
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public Commande getCommande() {
		return commande;
	}



	public void setCommande(Commande commande) {
		this.commande = commande;
	}



	public Produit getProduit() {
		return produit;
	}



	public void setProduit(Produit produit) {
		this.produit = produit;
	}



	public boolean isDansFormule() {
		return dansFormule;
	}



	public void setDansFormule(boolean dansFormule) {
		this.dansFormule = dansFormule;
	}



	public TypeProduit getType() {
		return type;
	}



	public void setType(TypeProduit type) {
		this.type = type;
	}



	public String getLibelleFormule() {
		return libelleFormule;
	}



	public void setLibelleFormule(String libelleFormule) {
		this.libelleFormule = libelleFormule;
	}
	

	



}
