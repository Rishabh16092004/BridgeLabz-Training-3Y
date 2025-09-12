public class student {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;
    public student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void setUniversityName(String name) {
        universityName = name;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public char getGrade() {
        return grade;
    }
    public static void main(String[] args) {
        student.setUniversityName("Global University");
        student student1 = new student("Hemashree", 101, 'A');
        student student2 = new student("Sharmila", 102, 'B');
        student1.displayTotalStudents();
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        student2.updateGrade('A');
        System.out.println();
        student2.displayStudentDetails();
    }


}
