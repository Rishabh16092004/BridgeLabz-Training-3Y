import java.util.Scanner;

public class Level3_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double Physicsmarks = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double Chemistrymarks = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double Mathsmarks = sc.nextDouble();
        double percentage = (Physicsmarks + Chemistrymarks + Mathsmarks)/3;
        if(percentage>80){
            System.out.println("Average marks : "+percentage +" , Grade = A , Remarks = (Level 4,above agency-normalized standards)");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("Average marks : "+percentage +" , Grade = B , Remarks = (Level 3,at agency-normalized standards)");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Average marks : "+percentage +" , Grade = C , Remarks = (Level 2,below, but approaching agency-normalized standards)");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("Average marks : "+percentage +" , Grade = d , Remarks = (Level 1,well below agency-normalized standards)");
        }
        else if(percentage>=40 && percentage<50){
            System.out.println("Average marks : "+percentage +" , Grade = E , Remarks = (Level 1-,too below agency-normalized standards)");
        }
        else{
            System.out.println("Average marks : "+percentage +" , Grade = R , Remarks = Remidial standards");
        }
    }
}
