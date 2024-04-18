package restaurant.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DetailCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private double prix;
	private Commande commande;
	private Produit produit;
	
	
	
	public DetailCommande() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DetailCommande(Integer id, double prix, Commande commande, Article article, Produit produit) {
		this.id = id;
		this.prix = prix;
		this.commande = commande;
		this.article = article;
		this.produit = produit;
	}
	
	public DetailCommande(double prix, Commande commande, Article article, Produit produit) {
		super();
		this.prix = prix;
		this.commande = commande;
		this.article = article;
		this.produit = produit;
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
