package restaurant.model;

import java.time.LocalDate;

public class Table {
	private int nombrePlace;
	private boolean disponible ;
	
	
	
	public Table(int nombrePlace, boolean disponible) {
		this.nombrePlace = nombrePlace;
		this.disponible = disponible;
	}

	public Table() {
		
	}

	public Table(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}
	
	
	public int getNombrePlace() {
		return nombrePlace;
	}
	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}


	@Override
	public String toString() {
		return "Table [nombrePlace=" + nombrePlace + "]";
	}
	
	
	
	
	
	
}
	