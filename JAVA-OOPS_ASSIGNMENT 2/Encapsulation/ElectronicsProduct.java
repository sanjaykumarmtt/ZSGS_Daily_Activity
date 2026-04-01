package Encapsulation;

public class ElectronicsProduct {
	
	private int productID;
	private String name;
	private double price;
	
	public ElectronicsProduct(int productID,String name, double price) {
		this.productID=productID;
		this.name = name;
		this.price = price;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double applyDiscontAndCalculatePrice(double percentage) {
		return this.price*percentage/100;
	}
}
