package Object;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Subject {
    private String subjectName;
    private Professor professor;
    private List<Learner> learners;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.learners = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to teach " + subjectName);
    }

    public void addLearner(Learner learner) {
        learners.add(learner);
    }

    public void showSubjectDetails() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Learners Enrolled:");
        for (Learner l : learners) {
            System.out.println(" - " + l.getName());
        }
    }
}

class Learner {
    private String name;
    private List<Subject> subjects;

    public Learner(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.addLearner(this);
            System.out.println(name + " enrolled in " + subject.getSubjectName());
        }
    }

    public void showEnrolledSubjects() {
        System.out.println("Learner: " + name);
        System.out.println("Subjects:");
        for (Subject s : subjects) {
            System.out.println(" - " + s.getSubjectName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Sharma");
        Professor prof2 = new Professor("Dr. Mehta");

        Subject cs = new Subject("Computer Science");
        Subject math = new Subject("Mathematics");

        Learner l1 = new Learner("Ravi");
        Learner l2 = new Learner("Priya");

        cs.assignProfessor(prof1);
        math.assignProfessor(prof2);

        l1.enrollSubject(cs);
        l1.enrollSubject(math);

        l2.enrollSubject(math);

        System.out.println();
        cs.showSubjectDetails();
        System.out.println();
        math.showSubjectDetails();
        System.out.println();
        l1.showEnrolledSubjects();
        System.out.println();
        l2.showEnrolledSubjects();
    }
}

