public class Main {
    public static void main(String[] args) {
        Student student = new Student("S101", "Raja Zain", "Software Engineering");
        Course course = new Course("CS204", "Software Construction & Dev", 3);

        Registration reg = new Registration(student, course);
        reg.displayRegistration();
    }
}