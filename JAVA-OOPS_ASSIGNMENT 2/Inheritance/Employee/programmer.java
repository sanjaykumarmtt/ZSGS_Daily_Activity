package Inheritance.Employee;

public class programmer extends Employee {

 

    public programmer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}

    @Override
    public void manageProjects() {
        System.out.println(getName() + " is managing unit testing and code documentation.");
    }

	@Override
	public void calclateBonus() {
		 System.out.println(getName() + " Bonus: " + (getSalary() * 0.10));
	}

	@Override
	public void geteratePerformanceReport() {
		 System.out.println(getName() + " shows great logic in module implementation.");
		
	}

}
