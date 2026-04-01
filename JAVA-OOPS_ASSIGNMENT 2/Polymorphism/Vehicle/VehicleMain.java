package Polymorphism.Vehicle;
public class VehicleMain {
	public static void main(String[] args) {
		
		Vehicle car=new Car();
		car.startEngine();
		car.stopEngine();
		
		Vehicle motorcycle=new Motorcycle();
		motorcycle.startEngine();
		motorcycle.stopEngine();
	}
}
