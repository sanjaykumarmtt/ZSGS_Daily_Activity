package Inheritance.Order;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder {

	private String deliveryAddress;
	private int trackingNumber;
	private String trackingStatus="panding";
	
	public OnlineOrder(int orderID, String customerName, LocalDate orderDate, String deliveryAddress,
			int trackingNumber) {
		super(orderID, customerName, orderDate);
		this.deliveryAddress = deliveryAddress;
		this.trackingNumber = trackingNumber;
		
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public int getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingStatus() {
		return trackingStatus;
	}

	public void setTrackingStatus(String trackingStatus) {
		this.trackingStatus = trackingStatus;
	}
	
	public String getDeliveryTime() {
		if(deliveryAddress.equalsIgnoreCase("Chennai")) {
			return "2 days";
		}else {
			return "5-7 days";
		}
	}
	public void updateTrackingStatus(String newStatus) {
		
		this.trackingStatus=newStatus;
		
		System.out.println("Order Status : "+this.trackingStatus);
		System.out.println("------------------------------------");
	}
}
