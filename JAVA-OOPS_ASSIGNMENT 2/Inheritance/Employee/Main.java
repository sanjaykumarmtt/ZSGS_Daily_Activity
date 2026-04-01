package Inheritance.Employee;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("---Company employee details---\n");


        Manager mgr = new Manager("Sanjay", "Vellore", 50000.0, "Project Manager");
        mgr.calclateBonus();
        mgr.geteratePerformanceReport();
        mgr.manageProjects();

        System.out.println("\n---------------------------\n");


        Developer dev = new Developer("Kumar", "Chennai", 40000.0, "Java Developer");
        dev.calclateBonus();
        dev.geteratePerformanceReport();
        dev.manageProjects();

        System.out.println("\n---------------------------\n");

        programmer prog = new programmer("Tamil", "Uthangarai", 30000.0, "Junior Programmer");
        prog.calclateBonus();
        prog.geteratePerformanceReport();
        prog.manageProjects();
    }
}