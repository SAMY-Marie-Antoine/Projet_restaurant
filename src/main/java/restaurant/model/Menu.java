package restaurant.model;

public class Menu {
	private  Produit  produit;
	private Formule formule;
	private calulPrix calculPrix;
	
	
	public Menu(Produit produit, Formule formule, calulPrix calculPrix) {
		this.produit = produit;
		this.formule = formule;
		this.calculPrix = calculPrix;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public Formule getFormule() {
		return formule;
	}


	public void setFormule(Formule formule) {
		this.formule = formule;
	}


	public calulPrix getCalculPrix() {
		return calculPrix;
	}


	public void setCalculPrix(calulPrix calculPrix) {
		this.calculPrix = calculPrix;
	}


	@Override
	public String toString() {
		return "Menu [produit=" + produit + "]";
	}
	
	
	
	
	
	

}
