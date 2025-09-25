package Assignment6_1.Access_Modifiers.Scenario1.hr.management;


import Assignment6_1.Access_Modifiers.Scenario1.hr.model.Employee; // Import Employee class

public class Manager extends Employee {

    public Manager(String name, String employeeId, String department, double salary) {
        super(name, employeeId, department, salary);
    }

    public void generateDepartmentReport() {
        System.out.println("--- Manager's Department Report for " + this.name + " ---");
        System.out.println("Employee Name (public, inherited): " + this.name);

        System.out.println("Employee Department (protected, inherited): " + this.department); // Accessible due to protected access


        System.out.println("Manager (subclass in different package) can access protected 'department'.");
        System.out.println("Cannot directly access default 'employeeId' or private 'salary'.");
        System.out.println();
    }
}
