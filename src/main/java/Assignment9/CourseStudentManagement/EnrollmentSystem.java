package Assignment9.CourseStudentManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EnrollmentSystem {
    private Set<Course> availableCourses;
    private Map<Student, Set<Course>> studentRegistrations;

    public EnrollmentSystem() {
        this.availableCourses = new HashSet<>();
        this.studentRegistrations = new HashMap<>();
    }

    // --- Course Management ---

    // CRUD - Add a new course
    public void addCourse(Course course) {
        if (availableCourses.add(course)) {
            System.out.println("Added Course: " + course.getCourseName() + " (ID: " + course.getCourseId() + ")");
        } else {
            System.out.println("Course with ID " + course.getCourseId() + " already exists.");
        }
    }

    // CRUD - Remove a course by ID
    public void removeCourse(int courseId) {
        Course dummyCourse = new Course(courseId, null);
        if (availableCourses.remove(dummyCourse)) {
            // Also remove this course from all student registrations
            studentRegistrations.forEach((student, courses) -> courses.remove(dummyCourse));
            System.out.println("Removed Course with ID: " + courseId);
        } else {
            System.out.println("Course with ID " + courseId + " not found for removal.");
        }
    }

    // View all courses
    public void viewAllCourses() {
        if (availableCourses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("\n--- All Available Courses ---");
        availableCourses.forEach(System.out::println);
        System.out.println("-----------------------------");
    }

    // --- Student Registration Management ---

    // Register a student for one or more courses
    public void registerStudentForCourse(Student student, Course course) {
        if (!availableCourses.contains(course)) {
            System.out.println("Error: Course " + course.getCourseName() + " (ID: " + course.getCourseId() + ") is not available.");
            return;
        }

        // Get the actual Course object from availableCourses to ensure consistency
        Course actualCourse = availableCourses.stream()
                .filter(c -> c.equals(course))
                .findFirst()
                .orElse(null);

        if (actualCourse == null) { // Should not happen if availableCourses.contains(course) is true
            System.out.println("Internal Error: Course not found despite being marked available.");
            return;
        }

        // Use the student object from the map if it already exists, otherwise add new
        Student actualStudent = studentRegistrations.keySet().stream()
                .filter(s -> s.equals(student))
                .findFirst()
                .orElse(student);

        studentRegistrations.putIfAbsent(actualStudent, new HashSet<>());
        Set<Course> coursesEnrolled = studentRegistrations.get(actualStudent);

        if (coursesEnrolled.add(actualCourse)) {
            System.out.println("Student " + actualStudent.getName() + " (ID: " + actualStudent.getStudentId() + ") registered for " + actualCourse.getCourseName());
        } else {
            System.out.println("Student " + actualStudent.getName() + " (ID: " + actualStudent.getStudentId() + ") was already registered for " + actualCourse.getCourseName());
        }
    }

    // Update a student’s registration (drop a course)
    public void dropCourseForStudent(Student student, Course course) {
        // Ensure we're using the actual student object if it exists as a map key
        Student actualStudent = studentRegistrations.keySet().stream()
                .filter(s -> s.equals(student))
                .findFirst()
                .orElse(null);

        if (actualStudent != null && studentRegistrations.containsKey(actualStudent)) {
            Set<Course> coursesEnrolled = studentRegistrations.get(actualStudent);
            if (coursesEnrolled.remove(course)) {
                System.out.println("Student " + actualStudent.getName() + " (ID: " + actualStudent.getStudentId() + ") dropped " + course.getCourseName());
            } else {
                System.out.println("Student " + actualStudent.getName() + " (ID: " + actualStudent.getStudentId() + ") was not registered for " + course.getCourseName());
            }
        } else {
            System.out.println("Student " + student.getName() + " (ID: " + student.getStudentId() + ") not found in registrations.");
        }
    }

    // Remove a student from the system (and all their registrations)
    public void removeStudent(int studentId) {
        Student dummyStudent = new Student(studentId, null);
        if (studentRegistrations.remove(dummyStudent) != null) {
            System.out.println("Removed Student with ID: " + studentId + " and all their registrations.");
        } else {
            System.out.println("Student with ID " + studentId + " not found for removal.");
        }
    }

    // Update a student's name (requires careful handling if Student objects are map keys)
    public void updateStudentName(int studentId, String newName) {
        Student dummyStudent = new Student(studentId, null);
        Student studentToUpdate = studentRegistrations.keySet().stream()
                .filter(s -> s.equals(dummyStudent))
                .findFirst()
                .orElse(null);
        if (studentToUpdate != null) {
            String oldName = studentToUpdate.getName();
            studentToUpdate.setName(newName); // Update the name on the actual object in the keySet
            System.out.println("Updated Student ID " + studentId + " name from '" + oldName + "' to '" + newName + "'");
        } else {
            System.out.println("Student with ID " + studentId + " not found for name update.");
        }
    }


    // View all student registrations
    public void viewAllRegistrations() {
        if (studentRegistrations.isEmpty()) {
            System.out.println("No students are currently registered for courses.");
            return;
        }
        System.out.println("\n--- All Student Registrations ---");
        studentRegistrations.forEach((student, courses) -> {
            System.out.println(student.getName() + " (ID: " + student.getStudentId() + ") enrolled in: ");
            if (courses.isEmpty()) {
                System.out.println("  - No courses");
            } else {
                courses.forEach(course -> System.out.println("  - " + course.getCourseName() + " (ID: " + course.getCourseId() + ")"));
            }
        });
        System.out.println("---------------------------------");
    }

    // --- Searching ---

    // Find all courses taken by a student
    public Set<Course> findCoursesTakenByStudent(int studentId) {
        Student dummyStudent = new Student(studentId, null);
        Student actualStudent = studentRegistrations.keySet().stream()
                .filter(s -> s.equals(dummyStudent))
                .findFirst()
                .orElse(null);
        if (actualStudent != null) {
            return studentRegistrations.get(actualStudent);
        }
        return Collections.emptySet(); // Return empty set if student not found
    }

    // Find all students registered for a given course
    public Set<Student> findStudentsRegisteredForCourse(int courseId) {
        Course dummyCourse = new Course(courseId, null);
        Set<Student> studentsForCourse = new HashSet<>();
        studentRegistrations.forEach((student, courses) -> {
            if (courses.contains(dummyCourse)) {
                studentsForCourse.add(student);
            }
        });
        return studentsForCourse;
    }

    // --- Sorting ---

    // Display all courses sorted by courseName
    public void displayCoursesSortedByName() {
        if (availableCourses.isEmpty()) {
            System.out.println("No courses to sort.");
            return;
        }
        List<Course> sortedList = new ArrayList<>(availableCourses);
        Collections.sort(sortedList, new CourseNameComparator());
        System.out.println("\n--- Courses Sorted by Name ---");
        sortedList.forEach(System.out::println);
        System.out.println("------------------------------");
    }

    // Display all students sorted by name (from map keys)
    public void displayStudentsSortedByName() {
        if (studentRegistrations.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        List<Student> sortedList = new ArrayList<>(studentRegistrations.keySet());
        Collections.sort(sortedList, new StudentNameComparator());
        System.out.println("\n--- Students Sorted by Name ---");
        sortedList.forEach(System.out::println);
        System.out.println("-------------------------------");
    }
}
