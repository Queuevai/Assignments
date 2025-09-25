package Assignment6_1.Access_Modifiers.Scenario1.hr.model;

public class Employee {
    private double salary;
    String employeeId;
    protected String department;
    public String name;

    public Employee(String name, String employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayPublicInfo() {
        System.out.println("Employee Name: " + name);
    }
}
