//package Object;
//
//import oops.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Course{
//    private String courseName;
//    private List<Student> students;
//    public Course(String courseName){
//        this.courseName=courseName;
//        this.students=new ArrayList<>();
//    }
//    public String getCourseName() {
//        return courseName;
//    }
//    public void enrollStudent(Student student){
//        if(!students.contains(student)){
//            students.add(student);
//            student.addCourse(this);
//        }
//    }
//    public void showStudents(){
//        System.out.println("Course: "+courseName+" has students:");
//        for(Student s : students){
//            System.out.println(s.getName());
//        }
//    }
//}
//class Scholar{
//    private String name;
//    private List<Course> courses;
//    public Scholar(String name){
//        this.name=name;
//        this.courses=new ArrayList<>();
//    }
//    public String getName() {
//        return name;
//    }
//    protected void addCourse(Course course){
//        if(!courses.contains(course)){
//            courses.add(course);
//        }
//    }
//    public void enroll(Course course){
//        course.enrollStudent(this);
//    }
//    public void showCourses(){
//        System.out.println("Students: "+name+" is enrolled in:");
//        for(Course course : courses){
//            System.out.println(course.getCourseName());
//        }
//    }
//
//}
//class School{
//    private String schoolName;
//    private List<Student> students;
//    public School(String schoolName){
//        this.schoolName=schoolName;
//        this.students=new ArrayList<>();
//    }
//    public void addStudent(Student student){
//        students.add(student);
//    }
//    public void showStudents(){
//        System.out.println("School: "+schoolName+" has students:");
//        for(Student student : students){
//            System.out.println(student.getName());
//        }
//    }
//}
//public class Association_Agggregation {
//    public static void main(String[] args) {
//        School school=new School("Delhi Public School");
//        Student student1=new Student("Aashvi");
//        Student student2=new Student("Atharv");
//        school.addStudent(student1);
//        school.addStudent(student2);
//        Course course1=new Course("Maths");
//        Course course2=new Course("Science");
//        student1.enroll(course1);
//        student1.enroll(course2);
//        student2.enroll(course2);
//        school.showStudents();
//        System.out.println("Students Courses");
//        student1.showCourses();
//        student2.showCourses();
//        System.out.println("Course Enrollments");
//        course1.showStudents();
//        course2.showStudents();
//    }
//}
