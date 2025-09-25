package Assignment6_1.Access_Modifiers.Scenario1.hr.payroll;


import Assignment6_1.Access_Modifiers.Scenario1.hr.model.Employee;

public class PayrollService {

    public void processPayroll(Employee emp) {
        System.out.println("--- Payroll Service for " + emp.name + " ---");
        System.out.println("Employee Name (public): " + emp.name);

        System.out.println("Employee Salary (via public getter): $" + emp.getSalary());
        System.out.println("Payroll Service can access salary only through its public getter.");
        System.out.println("Cannot directly access employeeId or department from this package.");
        System.out.println();
    }
}
