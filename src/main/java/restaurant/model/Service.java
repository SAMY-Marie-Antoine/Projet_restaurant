package restaurant.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Service {
	private int id;
	private List<Table> table = new ArrayList();
	private List<Reservation> reservations = new ArrayList();
	
	private LocalDate serviceJour;
	private LocalDateTime heure;
	
	
	
	public Service(int id, List<Table> table, List<Reservation> reservations, LocalDate serviceJour,
			LocalDateTime heure) {
		this.id = id;
		this.table = table;
		this.reservations = reservations;
		this.serviceJour = serviceJour;
		this.heure = heure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public List<Table> getTable() {
		return table;
	}
	public void setTable(List<Table> table) {
		this.table = table;
	}
	
	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}


	public LocalDate getServiceJour() {
		return serviceJour;
	}
	public void setServiceJour(LocalDate serviceJour) {
		this.serviceJour = serviceJour;
	}
	
	
	public LocalDateTime getHeure() {
		return heure;
	}
	public void setHeure(LocalDateTime heure) {
		this.heure = heure;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", table=" + table + ", reservations=" + reservations + ", serviceJour="
				+ serviceJour + ", heure=" + heure + "]";
	}
	

}
