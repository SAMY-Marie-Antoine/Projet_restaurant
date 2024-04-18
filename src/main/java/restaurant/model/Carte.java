package restaurant.model;

public class Carte {
	private int id;
	private Produit produit;
	
	
	public Carte(int id, Produit produit) {
		this.id = id;
		this.produit = produit;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	@Override
	public String toString() {
		return "Carte [id=" + id + ", produit=" + produit + "]";
	}
	
	
	
	

}
