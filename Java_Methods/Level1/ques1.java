package Level1;

import java.util.Scanner;

public class ques1 {
    public static double SI(double P,double R,double T){
        return (P*R*T)/100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double P = input.nextDouble();
        System.out.print("Enter Rate : ");
        double R = input.nextDouble();
        System.out.print("Enter Time : ");
        double T = input.nextDouble();
        double simpleInterest=SI(P,R,T);
        System.out.println("The Simple Interest is "+ simpleInterest +" for principle "+P+" and Rate "+R+" and Time "+T);
    }
}
