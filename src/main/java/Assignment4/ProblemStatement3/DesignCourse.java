package Assignment4.ProblemStatement3;

class DesignCourse extends Course implements CertificateProvider {

    public DesignCourse(String courseName, String duration) {
        super(courseName, duration);
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
        // Additional enrollment logic specific to design courses
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

