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
	@Column
	private List<Particularite> particularite=new ArrayList();
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Produit(Integer id, String libelle, double prix, boolean disponible, boolean dansFormule, TypeProduit type, List<Particularite> particularite) {
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.disponible = disponible;
		this.dansFormule = dansFormule;
		this.type = type;
		this.smallPhoto = id + "s.png";
		this.bigPhoto =  id + "b.png";;
		this.particularite = particularite;
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


	public List<Particularite> getParticularite() {
		return particularite;
	}


	public void setParticularite(List<Particularite> particularite) {
		this.particularite = particularite;
	}


	
	

}
