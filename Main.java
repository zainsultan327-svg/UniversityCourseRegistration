public class Main {
    public static void main(String[] args) {
        Student student = new Student("S101", "Raja Zain", "Software Engineering");
        student.displayStudent();

        Course course = new Course("CS204", "Software Construction & Dev", 3);
        course.displayCourse();
    }
}