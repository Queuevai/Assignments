package Assignment6_1.Access_Modifiers.Scenario1.hr.management;


import Assignment6_1.Access_Modifiers.Scenario1.hr.model.Employee;
import Assignment6_1.Access_Modifiers.Scenario1.hr.portal.HRPortal;
import Assignment6_1.Access_Modifiers.Scenario1.hr.payroll.PayrollService;

public class HRSystemTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Smith", "EMP001", "IT", 75000.00);
        Manager manager1 = new Manager("Bob Johnson", "MGR001", "Sales", 90000.00);

        HRPortal hrPortal = new HRPortal();
        PayrollService payrollService = new PayrollService();

        hrPortal.viewEmployeeDetails(emp1);
        hrPortal.viewEmployeeDetails(manager1);

        payrollService.processPayroll(emp1);
        payrollService.processPayroll(manager1);

        manager1.generateDepartmentReport();

        System.out.println("--- Main Test Access ---");
        System.out.println("Employee Name (public): " + emp1.name);
        System.out.println("Main method can only directly access public 'name'.");
        System.out.println("To get salary, must use public getter: $" + emp1.getSalary());
    }
}
