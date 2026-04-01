package Encapsulation;

import java.util.Scanner;

public class SmartPhoneMain {
	
	 public static void main(String[] args) {
	        SmartPhone myPhone = new SmartPhone("Samsung", "S23", 128);
	        
	        System.out.println("Phone Brand: " + myPhone.getBrand());
	        System.out.println("Mobile Model: "+myPhone.getModel());
	        System.out.println("Current Storage: " + myPhone.getStorageCapacity() + " GB");

	        System.out.println("----------------------------");
	        myPhone.increaseStorage(64);
	        System.out.println("Updated Storage: " + myPhone.getStorageCapacity() + " GB");
	       
	        myPhone.increaseStorage(-10);
	    }

}
