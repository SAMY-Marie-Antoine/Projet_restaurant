package restaurant.model;

import java.util.List;

@Entity
//Ajouter info selon mapping choisi inheritence Article
public class Menu extends Article{

	@OneToMany
	private  List<Produit>  produits;
	@ManyToOne
	private Formule formule;
	
	public Menu() {	}
	
	public Menu(Integer id, DetailCommande detailCommande,List<Produit> produits, Formule formule) {
		super(id, detailCommande);
		this.produits = produits;
		this.formule = formule;
	}

	public Menu(DetailCommande detailCommande,List<Produit> produits, Formule formule) {
		super(detailCommande);
		this.produits = produits;
		this.formule = formule;
	}

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}

	@Override
	public String toString() {
		return "{" +
			" produits='" + getProduits() + "'" +
			", formule='" + getFormule() + "'" +
			"}";
	}

}
