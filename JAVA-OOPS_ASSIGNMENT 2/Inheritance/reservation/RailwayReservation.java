package Inheritance.reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation{
	
	private int seatNumber;
	private String reservationStatus;
	
	public RailwayReservation(int reservationID, String customerName, LocalDate date, int seatNumber,
			String reservationStatus) {	
		super(reservationID, customerName, date);
		this.seatNumber = seatNumber;
		this.reservationStatus=reservationStatus;
	}
	
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String getReservation() {
		return reservationStatus;
	}

	@Override
	public void setReservation(String status) {
		this.reservationStatus=status;
	}
}
