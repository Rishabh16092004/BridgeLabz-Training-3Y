package Object;
import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department1 {
    private String deptName;

    public Department1(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String universityName;
    private List<Department1> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department1(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showStructure() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department1 d : departments) {
            System.out.println(" - " + d.getDeptName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(" - " + f.getName());
        }
    }

    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + universityName);
        departments.clear();
        faculties.clear();
        System.out.println("All departments deleted. Faculties still exist independently.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University u1 = new University("National University");
        u1.addDepartment("Computer Science");
        u1.addDepartment("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        u1.addFaculty(f1);
        u1.addFaculty(f2);

        u1.showStructure();

        u1.deleteUniversity();

        System.out.println("\nFaculty members can still exist:");
        System.out.println("Faculty: " + f1.getName());
        System.out.println("Faculty: " + f2.getName());
    }
}

