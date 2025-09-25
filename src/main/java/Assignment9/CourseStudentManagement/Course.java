package Assignment9.CourseStudentManagement;

import java.util.Objects;

public class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName (if needed for updates, though not explicitly in problem)
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{id=" + courseId + ", name='" + courseName + "'}";
    }

    /**
     * Two Course objects are considered equal if their 'courseId' is the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId;
    }

    /**
     * The hashCode must be consistent with equals.
     */
    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
