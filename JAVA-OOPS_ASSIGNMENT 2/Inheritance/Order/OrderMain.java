package Inheritance.Order;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import my.library.FastTaker;

public class OrderMain {
	
	static int customerID=1;
	static int trackingID=987654;
	
    public static void main(String[] args) {
    	
    	List<OnlineOrder> onlineOrder=new ArrayList<>();
    	FastTaker getInput=new FastTaker();
    	
    	System.out.println("___________ Welcome to Shop Market____________\n");
        while(true) {
        	System.out.println("1.PutOrder\n2.ViweOrder\n3.UpdateOrder");
        	int i=getInput.getNymber();
        	if(i==1) {
        		System.out.println("---------------------------");
        		System.out.println("Enter Name : ");
        		String name=getInput.getFulllineWord();
        		System.out.println("Enter DeliveryAddress : ");
        		String deliveryAddress=getInput.getFulllineWord();
        		
        		onlineOrder.add(new OnlineOrder(customerID, name, LocalDate.now(),
        							deliveryAddress,trackingID ));
        		System.out.println("_______Order SuccessFully Completed______");
        		System.out.println("------------------------------------------");
        		customerID++;
        		trackingID++;
        		
        	}else if(i==2) {
        		System.out.println("---------------Order List-----------------");
        		for(OnlineOrder order:onlineOrder) {
        			System.out.println("Order ID: " + order.getOrderID());
        	        System.out.println("Customer: " + order.getCustomerName());
        	        System.out.println("Order Date: " + order.getOrderDate());

        	        System.out.println("------------------------------------");
        	        
        	        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        	        System.out.println("Order Status: " + order.getTrackingStatus());
        	        System.out.println("Expected Delivery: " + order.getDeliveryTime());

        	        System.out.println("------------------------------------");
        		}	
        	}else if(i==3) {
        		System.out.println("---------------Update Only Tracking Status-----------------");
        		System.out.println("Enter Order Id :");
        		int id=getInput.getNymber();
        		OnlineOrder updatOrder=onlineOrder.get(id-1);
        		System.out.println("<<<<Shipped (Or) Out for Delivery>>>");
        		updatOrder.setTrackingStatus(getInput.getFulllineWord());	
        		onlineOrder.add(id, updatOrder);
        		
        		System.out.println("_______Tracking Status SuccessFully Completed______");
        		System.out.println("------------------------------------------");
        	}
        }
    }
}