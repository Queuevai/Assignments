package Assignment4.ProblemStatement3;

class ProgrammingCourse extends Course implements CertificateProvider {

    public ProgrammingCourse(String courseName, String duration) {
        super(courseName, duration);
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
        // Additional enrollment logic specific to programming courses
    }

    @Override
    public void startCourse() {
        System.out.println("Starting " + courseName);
        // Additional course start logic
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
        // Logic to actually generate a certificate document
    }
}

