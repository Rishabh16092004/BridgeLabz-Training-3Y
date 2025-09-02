public class StudentGrade {
    String name;
    String rollnumber;
    double[] marks;

    StudentGrade(String name, String rollnumber, double[] marks){
        this.name=name;
        this.rollnumber=rollnumber;
        this.marks=marks;
    }

    public String calculateGrade(double[] marks){
        double totalmarks = calculateTotalMarks(marks);
        if(totalmarks>=80 && totalmarks<=100){
            return "Grade A";
        }
        else if(totalmarks>=60 && totalmarks<80){
            return "Grade B";
        }
        else if(totalmarks>=50 && totalmarks<60){
            return "Grade C";
        }
        else if(totalmarks>=40 && totalmarks<50){
            return "Grade D";
        }
        else{
            return "Grade F";
        }
    }

    double calculateTotalMarks(double[] marks){
        double sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum/3;
    }

    void displayStudent(){
        System.out.println("Student name : "+name);
        System.out.println("Student rollnumber : "+rollnumber);
        System.out.println("Student Marks :");
        for(int i=0;i<marks.length;i++){
            System.out.println("Mark" +(i+1)+":"+marks[i]);
        }
        System.out.println(calculateGrade(marks));
        System.out.println("----------------------");
    }

    public static void main(String args[]){
        double[] mark1={80,70,75};
        double[] mark2={60,65,50};
        StudentGrade student1=new StudentGrade("Rishabh","2315001829",mark1);
        StudentGrade student2= new StudentGrade("Aryan","2315000476",mark2);
        student1.displayStudent();
        student2.displayStudent();
    }
}
