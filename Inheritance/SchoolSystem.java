class person{
    String name;
    int  age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Teacher extends person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }

    void displayRole(){
        displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: "+subject);
    }
}

class Student extends person{
    String grade;
    Student(String name, int age,String grade){
        super(name,age);
        this.grade=grade;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s1 = new Student("Ravi", 16, "10th Grade");
        Staff st1 = new Staff("Mrs. Gupta", 35, "Administration");

        System.out.println("--- Teacher Details ---");
        t1.displayRole();
        System.out.println("\n--- Student Details ---");
        s1.displayRole();
        System.out.println("\n--- Staff Details ---");
        st1.displayRole();
    }
}
