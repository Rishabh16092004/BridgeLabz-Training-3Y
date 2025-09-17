package Object;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showEmployeeInfo(){
        System.out.println(" Employee: "+name+", Role: "+role);
    }
}

class Department{
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees=new ArrayList<>();
    }
    public void addEmployee(String name,String role){
        employees.add(new Employee(name,role));
    }
    public void showDepartmentInfo(){
        System.out.println("Department: "+deptName);
        for(Employee e:employees){
            e.showEmployeeInfo();
        }
    }
}
class Company{
    private String companyName;
    private List<Department> departments;
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments=new ArrayList<>();
    }
    public Department addDepartment(String deptName){
        Department d=new Department(deptName);
        departments.add(d);
        return d;
    }
    public void showCompanyInfo(){
        System.out.println("Company: "+companyName);
        for(Department d:departments){
            d.showDepartmentInfo();
        }
    }
    public void deleteCompany(){
        System.out.println("delete company : " + companyName);
        departments.clear();
        System.out.println("All departments and employees deleted");
    }

}
public class Compostition {
    public static void main(String[] args) {
        Company company=new Company("Tech Solution");
        Department hr = company.addDepartment("HR");
        Department it =  company.addDepartment("IT");
        hr.addEmployee("Rishabh","HR Manager");
        hr.addEmployee("Prachetash","Recruiter");
        it.addEmployee("Rishabh","Software Engineer");
        it.addEmployee("Prachetash","System analyst");
        company.showCompanyInfo();
        company.deleteCompany();
    }
}
