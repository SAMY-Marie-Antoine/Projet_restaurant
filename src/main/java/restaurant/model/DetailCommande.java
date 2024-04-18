package restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detailCommande")
public class DetailCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private int qty;
	@Column
	private double prix;
	@ManyToOne
	//@JoinColumn(name="")
	private Commande commande;
	//private Produit produit;
	@ManyToOne   //@MANYTOMANY
	//@JoinColumn(name="")
	private Produit produitPosteCommande;
	@Column
	private Boolean dansFormule;
	@Enumerated(EnumType.STRING)
	@Column(name="type_produit",nullable = false, columnDefinition = "ENUM('Entree','Plat','Dessert','Boisson')")
	private TypeProduit type;
	
	
	
	
	
	public DetailCommande() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*public DetailCommande(Integer id, double prix, Commande commande, Article article, Produit produit) {
		this.id = id;
		this.prix = prix;
		this.commande = commande;
		this.article = article;
		this.produit = produit;
	}*/
	
	
	
	/*public DetailCommande(double prix, Commande commande, Article article, Produit produit) {
		super();
		this.prix = prix;
		this.commande = commande;
		this.article = article;
		this.produit = produit;
	}*/
	


	public Integer getId() {
		return id;
	}
	public DetailCommande(Integer id, int qty, double prix, Commande commande, Produit produitPosteCommande,
			Boolean isFormule, Produit produit) {
		super();
		this.id = id;
		this.qty = qty;
		this.prix = prix;
		this.commande = commande;
		this.produitPosteCommande = produitPosteCommande;
		this.isFormule = isFormule;
		this.produit = produit;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public Produit getProduitPosteCommande() {
		return produitPosteCommande;
	}


	public void setProduitPosteCommande(Produit produitPosteCommande) {
		this.produitPosteCommande = produitPosteCommande;
	}


	public Boolean getIsFormule() {
		return isFormule;
	}


	public void setIsFormule(Boolean isFormule) {
		this.isFormule = isFormule;
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
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	private Produit produit;
	

}
