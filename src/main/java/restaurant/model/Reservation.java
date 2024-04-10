package restaurant.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
	
	private int id;
	private String client;
	private int nombreConvive;
	private LocalDate serviceJour;
	private LocalDateTime serviceHeure;
	private Table table;

	
	public Reservation() {
		
	}

	
	public Reservation(int id, String client, int nombreConvive, LocalDate serviceJour, LocalDateTime serviceHeure,
			Table table) {
		this.id = id;
		this.client = client;
		this.nombreConvive = nombreConvive;
		this.serviceJour = serviceJour;
		this.serviceHeure = serviceHeure;
		this.table = table;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getNombreConvive() {
		return nombreConvive;
	}
	public void setNombreConvive(int nombreConvive) {
		this.nombreConvive = nombreConvive;
	}
	public LocalDate getServiceJour() {
		return serviceJour;
	}
	public void setServiceJour(LocalDate serviceJour) {
		this.serviceJour = serviceJour;
	}

	public LocalDateTime getServiceHeure() {
		return serviceHeure;
	}


	public void setServiceHeure(LocalDateTime serviceHeure) {
		this.serviceHeure = serviceHeure;
	}


	public Table getTable() {
		return table;
	}


	public void setTable(Table table) {
		this.table = table;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", client=" + client + ", nombreConvive=" + nombreConvive + ", serviceJour="
				+ serviceJour + ", serviceHeure=" + serviceHeure + " Table=" + table +"]";
	}
	
	
	
	
	

}
