public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String thesisTitle;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }
    public void displayPostgradDetails() {
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("CGPA: " + getCGPA());
    }
}

class UniversityManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 8.5);
        s1.displayDetails();
        System.out.println();
        PostgraduateStudent ps1 = new PostgraduateStudent(201, "Anita", 9.1, "AI and Robotics");
        ps1.displayPostgradDetails();
        ps1.setCGPA(9.3);
        System.out.println("Updated CGPA: " + ps1.getCGPA());
    }
}
