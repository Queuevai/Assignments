package Assignment8.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManagementSystem {

    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    // CRUD - Create: Add Employee
    public void addEmployee(Employee emp) {
        if (!employees.contains(emp)) { // Using equals() here to prevent adding duplicate IDs
            employees.add(emp);
            System.out.println("Added: " + emp.getName());
        } else {
            System.out.println("Employee with ID " + emp.getId() + " already exists.");
        }
    }

    // CRUD - Read: Display all employees
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\n--- All Employees ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("---------------------");
    }

    // CRUD - Update: Update Employee salary or department based on id
    public void updateEmployee(int id, String newDepartment, double newSalary) {
        // Create a dummy employee object for searching based on ID
        Employee searchEmployee = new Employee(id, null, null, 0);
        int index = employees.indexOf(searchEmployee); // Uses overridden equals()

        if (index != -1) {
            Employee emp = employees.get(index);
            emp.setDepartment(newDepartment);
            emp.setSalary(newSalary);
            System.out.println("Updated Employee ID " + id + ": " + emp.getName());
        } else {
            System.out.println("Employee with ID " + id + " not found for update.");
        }
    }

    // CRUD - Delete: Delete Employee based on id
    public void deleteEmployee(int id) {
        // Create a dummy employee object for searching based on ID
        Employee searchEmployee = new Employee(id, null, null, 0);
        boolean removed = employees.remove(searchEmployee); // Uses overridden equals()

        if (removed) {
            System.out.println("Deleted Employee with ID: " + id);
        } else {
            System.out.println("Employee with ID " + id + " not found for deletion.");
        }
    }

    // Search Employee by id using contains() and indexOf()
    public Employee searchEmployeeById(int id) {
        Employee searchEmployee = new Employee(id, null, null, 0); // Dummy object for search
        if (employees.contains(searchEmployee)) { // Uses overridden equals()
            int index = employees.indexOf(searchEmployee);
            return employees.get(index);
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Add Employees (CRUD - Create)
        System.out.println("--- Adding Employees ---");
        ems.addEmployee(new Employee(101, "Alice", "IT", 70000));
        ems.addEmployee(new Employee(102, "Bob", "HR", 60000));
        ems.addEmployee(new Employee(103, "Charlie", "Finance", 75000));
        ems.addEmployee(new Employee(104, "David", "IT", 72000));
        ems.addEmployee(new Employee(101, "Alice Duplicate", "IT", 70000)); // Attempt to add duplicate ID
        ems.displayAllEmployees();

        // Update Employee (CRUD - Update)
        System.out.println("\n--- Updating Employee 102 ---");
        ems.updateEmployee(102, "Marketing", 65000);
        ems.updateEmployee(999, "R&D", 80000); // Non-existent employee
        ems.displayAllEmployees();

        // Search Employee by ID
        System.out.println("\n--- Searching for Employee 103 ---");
        Employee foundEmp = ems.searchEmployeeById(103);
        if (foundEmp != null) {
            System.out.println("Found: " + foundEmp);
        } else {
            System.out.println("Employee 103 not found.");
        }

        System.out.println("\n--- Searching for Employee 105 ---");
        Employee notFoundEmp = ems.searchEmployeeById(105);
        if (notFoundEmp != null) {
            System.out.println("Found: " + notFoundEmp);
        } else {
            System.out.println("Employee 105 not found.");
        }

        // Delete Employee (CRUD - Delete)
        System.out.println("\n--- Deleting Employee 101 ---");
        ems.deleteEmployee(101);
        ems.deleteEmployee(999); // Non-existent employee
        ems.displayAllEmployees();
    }
}
