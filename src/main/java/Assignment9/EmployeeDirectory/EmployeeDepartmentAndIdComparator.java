package Assignment9.EmployeeDirectory;

import java.util.Comparator;

public class EmployeeDepartmentAndIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int departmentComparison = e1.getDepartment().compareTo(e2.getDepartment());
        if (departmentComparison != 0) {
            return departmentComparison;
        }
        // If departments are the same, sort by ID
        return Integer.compare(e1.getId(), e2.getId());
    }
}
