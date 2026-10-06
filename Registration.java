public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {
        System.out.println("\n==============================");
        System.out.println("  REGISTRATION DETAILS");
        System.out.println("==============================");
        student.displayStudent();
        course.displayCourse();
    }
}