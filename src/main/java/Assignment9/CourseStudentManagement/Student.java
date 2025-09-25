package Assignment9.CourseStudentManagement;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Setter for name (if needed for updates)
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "'}";
    }

    /**
     * Two Student objects are considered equal if their 'studentId' is the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    /**
     * The hashCode must be consistent with equals.
     */
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
