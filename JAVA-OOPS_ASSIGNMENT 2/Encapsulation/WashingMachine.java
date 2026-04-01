package Encapsulation;

public class WashingMachine extends ElectronicsProduct{
	
	private int warranty=0;
	
	public WashingMachine(int productID, String name, double price, int warranty) {
		super(productID,name, price);
		this.warranty = warranty;
	}
		
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public void extendWarranty(int extendMonths) {
		this.warranty+=extendMonths;
		System.out.println("Warranty extended by "+extendMonths+" months.");
	}
//	public int getWarrantyPeriod() {
//		return warranty;
//	}
}