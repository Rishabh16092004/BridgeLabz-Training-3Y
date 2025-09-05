public class Course {

    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java Basics", 30, 5000);
        Course c2 = new Course("Advanced Python", 40, 6000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        Course.updateInstituteName("Best Academy");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
