package Encapsulation;

public class ElectroniceMain {

	    public static void main(String[] args) {
	       
	        WashingMachine myMachine = new WashingMachine(1,"LG Fully Automatic", 25000.0, 12);
	        
	        System.out.println("ProductID: " + myMachine.getProductID());
	        System.out.println("Product: " + myMachine.getName());
	        System.out.println("Original Price: Rs." + myMachine.getPrice());
	        System.out.println("Warranty Period: " + myMachine.getWarranty() + " months");

	        System.out.println("------------------------------------");

	        double discountAmount = myMachine.applyDiscontAndCalculatePrice(10);
	        double finalPrice = myMachine.getPrice() - discountAmount;
	        System.out.println("Discount Amount: Rs." + discountAmount);
	        System.out.println("Final Price after Discount: Rs." + finalPrice);

	        System.out.println("------------------------------------");

	        myMachine.extendWarranty(6);
	        System.out.println("Updated Warranty: " + myMachine.getWarranty() + " months");
	    }
	}