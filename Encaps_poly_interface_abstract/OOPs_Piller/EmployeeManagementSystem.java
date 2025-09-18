package OOPs_Piller;

import java.util.*;

abstract class Employee{
    private int employeeID;
    private String name;
    private double baseSalary;

    public Employee(int employeeID, String name, double baseSalary){
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setbaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("ID: "+employeeID+",Name: "+name+", Salary: "+calculateSalary());
    }
}
interface Department{
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
class FullTimeEmployyee extends Employee implements Department{
    private String department;
    public FullTimeEmployyee(int id,String name,double salary){
        super(id,name,salary);
    }
    public double calculateSalary(){
        return getBaseSalary();
    }
    public void assignDepartment(String dept){
        department = dept;
    }
    public String getDepartmentDetails() {
        return "Department: "+department;
    }
}
class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id,double hourlyRate,int hoursWorked,String name){
        super(id,name,0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
    public void assignDepartment(String dept){
        department = dept;
    }
    public String getDepartmentDetails() {
        return "Department: "+department;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployyee f1 = new FullTimeEmployyee(1, "Rishabh", 50000);
        f1.assignDepartment("HR");
        PartTimeEmployee p1 = new PartTimeEmployee(2,40,500,"Pravin");
        p1.assignDepartment("IT");
        employees.add(f1);
        employees.add(p1);
        for (Employee e:employees){
            e.displayDetails();
            if(e instanceof Department){
                System.out.println(((Department)e).getDepartmentDetails());
            }
        }
    }
}
