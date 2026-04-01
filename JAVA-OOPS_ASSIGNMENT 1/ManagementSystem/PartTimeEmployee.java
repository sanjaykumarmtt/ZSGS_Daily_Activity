package ManagementSystem;

public class PartTimeEmployee extends Employee{
	
	private double hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(double hoursWorked, double hourlyRate,int id, String name) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public double calculateSalary() {
		return hoursWorked*hourlyRate;
	}

}
