package Level1;

import java.util.Scanner;

public class ques3 {
    public static int rounds(int a,int b,int c,int d){
        int perimeter = a+b+c;
        return d/perimeter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 in meter: ");
        int a = input.nextInt();
        System.out.print("Enter side 2 in meter: ");
        int b = input.nextInt();
        System.out.print("Enter side 3 in meter: ");
        int c = input.nextInt();
        int atheletewants = 5*1000;
        double round =  rounds(a,b,c,atheletewants);
        System.out.println("The Athlete wnats to complete "+round+" round to complete his 5Km run");
    }
}
