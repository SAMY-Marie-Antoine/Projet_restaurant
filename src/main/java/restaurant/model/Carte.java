package restaurant.model;

@Entity
//Info selon mapping inheritence choisi dans Article
public class Carte extends Article {

	@Column(columnDefinition="INT",nullable=false)
	private int quantite;
	@OneToOne
	private Produit produit;
	

	public Carte() {}
	
	public Carte(Integer id, DetailCommande detailCommande,int quantite, Produit produit) {
		super(id, detailCommande);
		this.quantite = quantite;
		this.produit = produit;
	}	
	
	public Carte(DetailCommande detailCommande,int quantite, Produit produit) {
		super(detailCommande);
		this.quantite = quantite;
		this.produit = produit;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + super.getId() + "'" +
			", quantite='" + getQuantite() + "'" +
			", produit='" + getProduit() + "'" +
			"}";
	}
	
}
