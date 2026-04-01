package ManagementSystem;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double calculateSalary() {
		return 0.0;
	}

	public void displayDetails() {
		System.out.println("Employee ID :"+id+"\nEmployee Name :"+name+"\nEmployee salary :"+calculateSalary());
		System.out.println();
	}
}
