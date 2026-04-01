package Inheritance.reservation;

import java.time.LocalDate;

public class ResortReservation extends Reservation{
	
	private int roomNumber;
	private String reservationStatus;
	
	public ResortReservation(int reservationID, String customerName, LocalDate date, int roomNumber,
			String reservationStatus) {
		super(reservationID, customerName, date);
		this.roomNumber = roomNumber;
		this.reservationStatus = reservationStatus;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	@Override
	public String getReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReservation(String status) {
		// TODO Auto-generated method stub
		this.reservationStatus=status;
	}
	

}
