package Assignment9.EmployeeDirectory;

import java.util.List;

public class EmployeeDirectoryTest {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // --- CRUD - Add Employees ---
        System.out.println("--- Add Employees ---");
        directory.addEmployee(new Employee(101, "Alice", "IT", 70000));
        directory.addEmployee(new Employee(102, "Bob", "HR", 60000));
        directory.addEmployee(new Employee(103, "Charlie", "Finance", 75000));
        directory.addEmployee(new Employee(104, "David", "IT", 72000));
        directory.addEmployee(new Employee(105, "Eve", "Marketing", 68000));
        directory.addEmployee(new Employee(101, "Alice Duplicate", "Sales", 80000)); // Attempt to add duplicate ID
        directory.viewAllEmployees();

        // --- CRUD - Update Employee Department ---
        System.out.println("\n--- Update Employee 102 Department ---");
        directory.updateEmployeeDepartment(102, "Sales");
        directory.updateEmployeeDepartment(999, "NonExistent"); // Update non-existent
        directory.viewAllEmployees();

        // --- Searching - Find Employee by ID ---
        System.out.println("\n--- Search Employee by ID ---");
        Employee foundEmp = directory.findEmployeeById(103);
        if (foundEmp != null) {
            System.out.println("Found Employee by ID 103: " + foundEmp);
        } else {
            System.out.println("Employee with ID 103 not found.");
        }

        Employee notFoundEmp = directory.findEmployeeById(999);
        if (notFoundEmp != null) {
            System.out.println("Found Employee by ID 999: " + notFoundEmp);
        } else {
            System.out.println("Employee with ID 999 not found.");
        }

        // --- Searching - Find all Employees in a Department ---
        System.out.println("\n--- Find all Employees in 'IT' Department ---");
        List<Employee> itEmployees = directory.findAllEmployeesInDepartment("IT");
        if (!itEmployees.isEmpty()) {
            itEmployees.forEach(System.out::println);
        } else {
            System.out.println("No employees found in IT department.");
        }

        System.out.println("\n--- Find all Employees in 'Sales' Department ---");
        List<Employee> salesEmployees = directory.findAllEmployeesInDepartment("Sales");
        if (!salesEmployees.isEmpty()) {
            salesEmployees.forEach(System.out::println);
        } else {
            System.out.println("No employees found in Sales department.");
        }

        // --- Sorting - Display Employees Sorted by Name ---
        directory.displayEmployeesSortedByName();

        // --- Sorting - Display Employees Sorted by Department then ID ---
        directory.displayEmployeesSortedByDepartmentAndId();

        // --- CRUD - Remove Employee ---
        System.out.println("\n--- Remove Employee 101 ---");
        directory.removeEmployee(101);
        directory.removeEmployee(999); // Remove non-existent
        directory.viewAllEmployees();
    }
}
