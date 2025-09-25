package Assignment9.CourseStudentManagement;

import java.util.Set;

public class EnrollmentSystemTest {
    public static void main(String[] args) {
        EnrollmentSystem system = new EnrollmentSystem();

        // --- Setup: Add Courses ---
        System.out.println("--- Setup: Adding Courses ---");
        Course java = new Course(101, "Java Programming");
        Course python = new Course(102, "Python for Data Science");
        Course webDev = new Course(103, "Web Development Basics");
        Course db = new Course(104, "Database Management");
        Course algo = new Course(105, "Algorithms & Data Structures");

        system.addCourse(java);
        system.addCourse(python);
        system.addCourse(webDev);
        system.addCourse(db);
        system.addCourse(algo);
        system.addCourse(new Course(101, "Duplicate Java")); // Attempt to add duplicate
        system.viewAllCourses();

        // --- Setup: Create Students ---
        Student alice = new Student(1, "Alice Smith");
        Student bob = new Student(2, "Bob Johnson");
        Student charlie = new Student(3, "Charlie Brown");

        // --- Register Students for Courses ---
        System.out.println("\n--- Registering Students ---");
        system.registerStudentForCourse(alice, java);
        system.registerStudentForCourse(alice, python);
        system.registerStudentForCourse(bob, java);
        system.registerStudentForCourse(bob, webDev);
        system.registerStudentForCourse(charlie, db);
        system.registerStudentForCourse(charlie, python);
        system.registerStudentForCourse(alice, java); // Alice tries to register for Java again
        system.viewAllRegistrations();

        // --- Update Student's Registration (Drop/Add) ---
        System.out.println("\n--- Updating Registrations ---");
        system.dropCourseForStudent(alice, python); // Alice drops Python
        system.registerStudentForCourse(alice, algo); // Alice adds Algorithms
        system.viewAllRegistrations();

        // --- Searching ---
        System.out.println("\n--- Searching for Courses taken by Alice (ID 1) ---");
        Set<Course> aliceCourses = system.findCoursesTakenByStudent(1);
        if (!aliceCourses.isEmpty()) {
            aliceCourses.forEach(System.out::println);
        } else {
            System.out.println("Alice is not registered for any courses.");
        }

        System.out.println("\n--- Searching for Students in Java Programming (ID 101) ---");
        Set<Student> javaStudents = system.findStudentsRegisteredForCourse(101);
        if (!javaStudents.isEmpty()) {
            javaStudents.forEach(System.out::println);
        } else {
            System.out.println("No students registered for Java Programming.");
        }

        // --- Sorting ---
        system.displayCoursesSortedByName();
        system.displayStudentsSortedByName();

        // --- Update Student Name ---
        System.out.println("\n--- Updating Student Name ---");
        system.updateStudentName(2, "Robert Johnson"); // Bob becomes Robert
        system.viewAllRegistrations(); // Check if name reflects

        // --- Remove Course ---
        System.out.println("\n--- Removing Course 'Python for Data Science' (ID 102) ---");
        system.removeCourse(102); // This should also remove Python from Charlie's registration
        system.viewAllCourses();
        system.viewAllRegistrations();

        // --- Remove Student ---
        System.out.println("\n--- Removing Student Charlie (ID 3) ---");
        system.removeStudent(3);
        system.viewAllRegistrations();
        system.removeStudent(999); // Remove non-existent student
    }
}
