package Assignment4.ProblemStatement3;

public class OnlineLearningTest {
    public static void main(String[] args) {
        // Programming Course
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming Course", "10 weeks");
        javaCourse.enrollStudent("John");
        javaCourse.startCourse();
        javaCourse.generateCertificate("John");

        System.out.println(); // For better readability

        // Design Course
        DesignCourse graphicDesignCourse = new DesignCourse("Graphic Design Course", "8 weeks");
        graphicDesignCourse.enrollStudent("Alice");
        graphicDesignCourse.startCourse();
        graphicDesignCourse.generateCertificate("Alice");
    }
}

