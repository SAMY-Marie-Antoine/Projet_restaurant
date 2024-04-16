package restaurant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length = 35 )
	private String libelle;
	@Column(nullable = false )
	private double prix;
	@Column(nullable = false )
	private boolean disponible;
	@Column
	private boolean dansFormule;
	@Enumerated(EnumType.STRING)
	@Column(name="type_produit",nullable = false, columnDefinition = "ENUM('Entree','Plat','Dessert','Boisson')")
	private TypeProduit type;
	@Column
	private String smallPhoto;
	@Column
	private String bigPhoto;
	@Column(nullable = false)
	private boolean allergie_oeufs;
	@Column(nullable = false)
	private boolean allergie_gluten;
	@Column(nullable = false)
	private boolean allergie_arachides;
	@Column(nullable = false)
	private boolean allergie_lait;
	@Column(nullable = false)
	private boolean allergie_soja;
	@Column(nullable = false)
	private boolean hallal;
	@Column(nullable = false)
	private boolean vegan;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Produit(Integer id, String libelle, double prix, boolean disponible, boolean dansFormule, TypeProduit type,
			String smallPhoto, String bigPhoto, boolean allergie_oeufs, boolean allergie_gluten,
			boolean allergie_arachides, boolean allergie_lait, boolean allergie_soja, boolean hallal, boolean vegan) {
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.disponible = disponible;
		this.dansFormule = dansFormule;
		this.type = type;
		this.smallPhoto = id + "s.png";
		this.bigPhoto =  id + "b.png";
		this.allergie_oeufs = allergie_oeufs;
		this.allergie_gluten = allergie_gluten;
		this.allergie_arachides = allergie_arachides;
		this.allergie_lait = allergie_lait;
		this.allergie_soja = allergie_soja;
		this.hallal = hallal;
		this.vegan = vegan;
	}

	//#Todo à faire au niveau du front
	
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


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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


	public String getSmallPhoto() {
		return smallPhoto;
	}


	public void setSmallPhoto(String smallPhoto) {
		this.smallPhoto = smallPhoto;
	}


	public String getBigPhoto() {
		return bigPhoto;
	}


	public void setBigPhoto(String bigPhoto) {
		this.bigPhoto = bigPhoto;
	}


	public boolean isAllergie_oeufs() {
		return allergie_oeufs;
	}


	public void setAllergie_oeufs(boolean allergie_oeufs) {
		this.allergie_oeufs = allergie_oeufs;
	}


	public boolean isAllergie_gluten() {
		return allergie_gluten;
	}


	public void setAllergie_gluten(boolean allergie_gluten) {
		this.allergie_gluten = allergie_gluten;
	}


	public boolean isAllergie_arachides() {
		return allergie_arachides;
	}


	public void setAllergie_arachides(boolean allergie_arachides) {
		this.allergie_arachides = allergie_arachides;
	}


	public boolean isAllergie_lait() {
		return allergie_lait;
	}


	public void setAllergie_lait(boolean allergie_lait) {
		this.allergie_lait = allergie_lait;
	}


	public boolean isAllergie_soja() {
		return allergie_soja;
	}


	public void setAllergie_soja(boolean allergie_soja) {
		this.allergie_soja = allergie_soja;
	}


	public boolean isHallal() {
		return hallal;
	}


	public void setHallal(boolean hallal) {
		this.hallal = hallal;
	}


	public boolean isVegan() {
		return vegan;
	}


	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	

}
