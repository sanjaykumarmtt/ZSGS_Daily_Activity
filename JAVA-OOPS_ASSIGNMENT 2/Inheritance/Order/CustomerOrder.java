package Inheritance.Order;
import java.time.LocalDate;

public class CustomerOrder {
	
	private int orderID;
	private String customerName;
	private LocalDate orderDate;
	
	public CustomerOrder(int orderID, String customerName, LocalDate orderDate) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	
	public int getOrderID() {
		return orderID;
	}
	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
}
