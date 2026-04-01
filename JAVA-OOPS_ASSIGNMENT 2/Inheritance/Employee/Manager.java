package Inheritance.Employee;

public class Manager extends Employee{
	
	public Manager(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
	}

	@Override
	public void calclateBonus() {
	System.out.println(getSalary()*0.20);	
	}

	@Override
	public void geteratePerformanceReport() {
		System.out.println(getName()+" is leading the team exceptionally.");
	}

	@Override
	public void manageProjects() {
		System.out.println(getName()+" is managing Project Timelines.");
	}
	
}
