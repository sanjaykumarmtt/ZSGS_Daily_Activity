package ManagementSystem;

public class Mainclass {
	public static void main(String[] args) {
		Employee fullTimeEmp=new FullTimeEmployee(15000,105,"Sanjay k");
		fullTimeEmp.displayDetails();
		//System.out.println("Monthly  = "+fullTimeEmp.calculateSalary());
		Employee PartTimeEmp=new PartTimeEmployee(10,100,104,"SanjayKumar k");
		PartTimeEmp.displayDetails();
	}
}