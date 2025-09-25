package Assignment9.EmployeeDirectory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class EmployeeDirectory {
    private Set<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new HashSet<>();
    }

    // CRUD - Add a new employee
    public void addEmployee(Employee emp) {
        if (employees.add(emp)) { // Set.add() returns true if element was added (not a duplicate)
            System.out.println("Added Employee: " + emp.getName() + " (ID: " + emp.getId() + ")");
        } else {
            System.out.println("Failed to add: Employee with ID " + emp.getId() + " already exists.");
        }
    }

    // CRUD - Remove an employee by ID
    public void removeEmployee(int id) {
        // Create a dummy Employee object with just the ID for lookup using equals/hashCode
        Employee dummyEmployee = new Employee(id, null, null, 0);
        if (employees.remove(dummyEmployee)) {
            System.out.println("Removed Employee with ID: " + id);
        } else {
            System.out.println("Employee with ID " + id + " not found for removal.");
        }
    }

    // CRUD - Update an employee’s department
    public void updateEmployeeDepartment(int id, String newDepartment) {
        Employee foundEmployee = findEmployeeById(id);
        if (foundEmployee != null) {
            foundEmployee.setDepartment(newDepartment);
            System.out.println("Updated Employee ID " + id + " department to: " + newDepartment);
        } else {
            System.out.println("Employee with ID " + id + " not found for update.");
        }
    }

    // CRUD - View all employees
    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Employee directory is empty.");
            return;
        }
        System.out.println("\n--- All Employees in Directory ---");
        employees.forEach(System.out::println); // HashSet order is not guaranteed
        System.out.println("----------------------------------");
    }

    // Searching - Find an employee by ID
    public Employee findEmployeeById(int id) {
        Employee dummyEmployee = new Employee(id, null, null, 0);
        for (Employee emp : employees) {
            if (emp.equals(dummyEmployee)) { // Using the overridden equals()
                return emp;
            }
        }
        return null;
    }

    // Searching - Find all employees in a given department
    public List<Employee> findAllEmployeesInDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Sorting - Display employees sorted by name
    public void displayEmployeesSortedByName() {
        if (employees.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        List<Employee> sortedList = new ArrayList<>(employees); // Convert Set to List for sorting
        Collections.sort(sortedList, new EmployeeNameComparator());
        System.out.println("\n--- Employees Sorted by Name ---");
        sortedList.forEach(System.out::println);
        System.out.println("----------------------------------");
    }

    // Sorting - Display employees sorted by department and then by ID
    public void displayEmployeesSortedByDepartmentAndId() {
        if (employees.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        List<Employee> sortedList = new ArrayList<>(employees); // Convert Set to List for sorting
        Collections.sort(sortedList, new EmployeeDepartmentAndIdComparator());
        System.out.println("\n--- Employees Sorted by Department then ID ---");
        sortedList.forEach(System.out::println);
        System.out.println("----------------------------------------------");
    }
}
