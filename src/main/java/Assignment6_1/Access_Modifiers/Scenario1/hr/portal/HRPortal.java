package Assignment6_1.Access_Modifiers.Scenario1.hr.portal;


import Assignment6_1.Access_Modifiers.Scenario1.hr.model.Employee;

public class HRPortal {

    public void viewEmployeeDetails(Employee emp) {
        System.out.println("--- HR Portal View for " + emp.name + " ---");
        System.out.println("Employee Name (public): " + emp.name);

        System.out.println("HR Portal can only access public information directly or via getters/setters.");
        System.out.println("Cannot directly access employeeId, department, or salary from this package.");
        System.out.println();
    }
}
