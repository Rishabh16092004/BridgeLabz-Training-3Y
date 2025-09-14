class Employeee{
    String name;
    int id;
    double salary;

    Employeee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employeee{
    int teamSize;
    Manager(String name, int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}

class Developer extends Employeee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employeee {
    String university;

    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employeee manager = new Manager("Alice", 101, 80000, 10);
        Employeee developer = new Developer("Bob", 102, 60000, "Java");
        Employeee intern = new Intern("Charlie", 103, 20000, "MIT");

        manager.displayDetails();
        System.out.println("-----------------");
        developer.displayDetails();
        System.out.println("-----------------");
        intern.displayDetails();
    }
}
