package Assignment9.EmployeeDirectory;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary; // Added salary for realism, though not explicitly used in equals/hashCode for this problem

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters for update operations
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }

    /**
     * Two Employee objects are considered equal if their 'id' is the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    /**
     * The hashCode must be consistent with equals. If two objects are equal (based on id),
     * their hash codes must be the same.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
