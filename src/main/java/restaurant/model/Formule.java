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
	@Column(nullable =false,columnDefinition="DECIMAL(5,2)")
	private double prix;
	//Check mapping ManyToMany?
	@Column(nullable = false)
	private List<TypeProduit> typeProduits=new ArrayList();
	
	public Formule() {}

	public Formule(Integer id, String libelle, double prix, List<TypeProduit> typeProduits) {
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.typeProduits = typeProduits;
	}
	
	public Formule(String libelle, double prix, List<TypeProduit> typeProduits) {
		this.libelle = libelle;
		this.prix = prix;
		this.typeProduits = typeProduits;
	}
	
	public void afficherDetail() {
		//#Todo
	}
	
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

	public List<TypeProduit> getTypeProduits() {
		return typeProduits;
	}

	public void setTypeProduits(List<TypeProduit> typeProduits) {
		this.typeProduits = typeProduits;
	}

}
