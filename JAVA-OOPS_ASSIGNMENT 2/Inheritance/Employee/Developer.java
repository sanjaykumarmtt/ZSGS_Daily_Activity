package Inheritance.Employee;

public class Developer extends Employee {
	public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public void manageProjects() {
        System.out.println(getName() + " is working on software modules and debugging.");
    }

	@Override
	public void calclateBonus() {
		System.out.println(getName() + " Bonus: " + (getSalary() * 0.15));
		
	}

	@Override
	public void geteratePerformanceReport() {
		 System.out.println(getName() + " is developing high-quality code and features.");
		
	}
}
