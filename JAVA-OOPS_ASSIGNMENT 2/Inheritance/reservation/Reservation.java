package Inheritance.reservation;
import java.time.LocalDate;

abstract public class Reservation {
	
	private int reservationID;
	private String customerName;
	private LocalDate date;
	
	public Reservation(int reservationID, String customerName, LocalDate date) {
	
		this.reservationID = reservationID;
		this.customerName = customerName;
		this.date = date;
	}

	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	abstract String getReservation();
	abstract void setReservation(String status);
}
class demo{
	
	static void main() {
	System.out.println();
	}
	
}
