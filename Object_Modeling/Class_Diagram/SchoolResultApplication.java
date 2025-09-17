package Class_Diagram;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No Subjects";
        }

        int totalMarks = 0;
        for (Subject s : subjects) {
            totalMarks += s.getMarks();
        }

        double average = totalMarks / (double) subjects.size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}

public class SchoolResultApplication {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(john);

        System.out.println("Student: " + john.getName());
        for (Subject s : john.getSubjects()) {
            System.out.println("Subject: " + s.getName() + " | Marks: " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}


