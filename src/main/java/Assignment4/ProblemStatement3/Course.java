package Assignment4.ProblemStatement3;


abstract class Course {
    protected String courseName;
    protected String duration; // e.g., "10 weeks", "6 months"

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public abstract void enrollStudent(String studentName);
    public abstract void startCourse();
}
