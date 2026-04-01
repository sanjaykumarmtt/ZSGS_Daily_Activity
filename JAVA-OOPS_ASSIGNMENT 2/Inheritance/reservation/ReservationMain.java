package Inheritance.reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import my.library.FastTaker;

public class ReservationMain {

	static int resortReservationID = 1;
	static int railwayReservationID = 1;
	static int roomNumberOrSetNumber = 202;
	
	static FastTaker getInput = new FastTaker();
	

	public static void main(String[] args) {

		List<RailwayReservation> railwayReservation = new ArrayList<>();
		List<ResortReservation> resortReservation = new ArrayList<>();

		System.out.println("______________Indian ResortReservation Or RailwayReservation______________\n");

		while (true) {

			System.out.println("1.RailwayReservation\n2.ResortReservation");
			int resor = getInput.getNymber();

			if (resor == 1) {
				System.out.println("_________Welcom To RailwayReservation________\n");

				System.out.println("1.ReservRailwaySeat\n2.ViweReservation\n3.Check Out Reservation");
				int raill = getInput.getNymber();
				if (raill == 1) {

					System.out.println("_________ ReservRailwaySeat___________\n");
					String data[] = reservation();

					if (railwayReservation.size() < 3) {
						railwayReservation.add(new RailwayReservation(railwayReservationID, data[0],
								LocalDate.parse(data[1]), roomNumberOrSetNumber, "Booking Success Full"));

						System.out.println("_______RailwaySeatReserv SuccessFully Completed______");
					} else {
						railwayReservation.add(new RailwayReservation(railwayReservationID, data[0],
								LocalDate.parse(data[1]), roomNumberOrSetNumber, "Panding"));
						System.out.println("_______RailwaySeatReserv is Panding Plese Wate________");
					}

					System.out.println("----------Thank You for Reservation-----------");
					railwayReservationID++;
					roomNumberOrSetNumber++;

				} else if (raill == 2) {

					System.out.println("_______________ReservationID Datas______________");

					for (RailwayReservation reservation : railwayReservation) {

						System.out.println("ReservationID : " + reservation.getReservationID());
						System.out.println("CustomerName : " + reservation.getCustomerName());
						System.out.println("SeatNumber : " + reservation.getSeatNumber());
						System.out.println("Date : " + reservation.getDate());
						System.out.println("ReservationStatus : " + reservation.getReservation());
						System.out.println("-----------------------------------------");

					}
					System.out.println("----------Thank You-----------");

				} else if (raill == 3) {

					if (railwayReservation.size() > 3) {

						System.out.println("Enter Reservation ID : ");
						int reservationID = getInput.getNymber();
						railwayReservation.remove(reservationID - 1);

						if (railwayReservation.size() <= 3) {
							RailwayReservation UpdateReservas = railwayReservation.get(railwayReservation.size() - 1);
							UpdateReservas.setReservation("Booking Success Full");
							railwayReservation.set(railwayReservation.size() - 1, UpdateReservas);

							System.out.println("--------" + UpdateReservas.getReservationID()
									+ " Booking Success Full This ID------");
						}
						System.out.println("------------------------------------------");
					} else {
						System.out.println("---Reservation not full please go to reserve seat---");
						System.out.println("----------Thank You-----------");
					}

				}

			} else if (resor == 2) {

				System.out.println("_________Welcom To ResortReservation________\n");

				System.out.println("1.ReservRoom\n2.ViweReservationRoom\n3.Check Out Room");
				int room = getInput.getNymber();
				if (room == 1) {

					System.out.println("_________ ReservRailwaySeat___________\n");
					String data[] = reservation();

					if (resortReservation.size() < 3) {
						resortReservation.add(new ResortReservation(resortReservationID, data[0],
								LocalDate.parse(data[1]), roomNumberOrSetNumber, "Room Booking Success Full"));

						System.out.println("_______Room Reserv SuccessFully Completed______\n");
					} else {
						railwayReservation.add(new RailwayReservation(resortReservationID, data[0],
								LocalDate.parse(data[1]), roomNumberOrSetNumber, "Panding"));
						System.out.println("_______Room Reserv is Panding Plese Wate________\n");
					}

					System.out.println("----------Thank You for Reservation-----------\n");
					resortReservationID++;
					roomNumberOrSetNumber++;

				}
				 else if (room == 2) {

						System.out.println("_______________Room ReservationID Datas______________");

						for (ResortReservation reservation : resortReservation) {

							System.out.println("ReservationID : " + reservation.getReservationID());
							System.out.println("CustomerName : " + reservation.getCustomerName());
							System.out.println("Room Number : " + reservation.getRoomNumber());
							System.out.println("Date : " + reservation.getDate());
							System.out.println("ReservationStatus : " + reservation.getReservation());
							System.out.println("-----------------------------------------");

						}
						System.out.println("----------Thank You-----------\n");

				}else if (room == 3) {

					if (resortReservation.size() > 3) {

						System.out.println("Enter Reservation ID : ");
						int reservationID = getInput.getNymber();
						resortReservation.remove(reservationID - 1);

						if (resortReservation.size() <= 3) {
							ResortReservation UpdateReservas = resortReservation.get(resortReservation.size() - 1);
							UpdateReservas.setReservation("Room Booking Success Full");
							resortReservation.set(resortReservation.size() - 1, UpdateReservas);

							System.out.println("--------" + UpdateReservas.getReservationID()
									+ " Booking Success Full This ID------");
						}
						System.out.println("------------------------------------------");
					} else {
						System.out.println("---Reservation not full please go to reserve seat---");
						System.out.println("----------Thank You-----------");
					}

				}

			}
		}

	}

	public static String[] reservation() {

		System.out.println("Enter Name :");
		String name = getInput.getFulllineWord();
		System.out.println("Enter Date Then Date structure YYYY-MM-DD=(2026-03-09): ");
		String String = getInput.getFulllineWord();

		return new String[] { name, String };
	}

}
