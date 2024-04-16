package restaurant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formule")
public class Formule {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length = 35 )
	private String libelle;
	@Column(nullable = false )
	private double prix;
	@Column(nullable = false )
	private List<Produit> produits=new ArrayList();
	
	public Formule() {
		// TODO Auto-generated constructor stub
	}

	public Formule(Integer id, String libelle, double prix, List<Produit> produits) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.produits = produits;
	}

	
	//#Todo
	
	public void afficherDetail() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<Produit> getProduit() {
		return produits;
	}

	public void setProduit(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	

}