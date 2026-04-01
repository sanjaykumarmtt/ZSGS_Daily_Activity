package ManagementSystem;

public class FullTimeEmployee extends Employee{
	
	private double monthlySalay;

	public FullTimeEmployee(double monthlySalay,int id,String name) {
		super(id,name);
		this.monthlySalay = monthlySalay;
	}
	@Override
	public double calculateSalary() {
		return monthlySalay;
	}
	
}
