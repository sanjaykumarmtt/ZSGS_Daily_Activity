package Polymorphism.Vehicle;

public class Car extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("start Car motorcycle");
	}
	@Override
	public void stopEngine() {
		System.out.println("stop Car motorcycle");	
	}
}
