package Level1;

import java.util.Scanner;

public class ques11 {
    public static double[] calculateTrigonometricFunction(double angle){
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cosin = Math.cos(radians);
        double tangent = Math.tan(radians);
        double[] result =  new double[3];
        result[0]=sin;
        result[1]=cosin;
        result[2]=tangent;
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter angle in degrees : ");
        double angle=sc.nextDouble();
        double[] triValues = calculateTrigonometricFunction(angle);
        System.out.println("Sine("+angle+") = "+triValues[0]);
        System.out.println("Cosin("+angle+") = "+triValues[1]);
        System.out.println("Tangent("+angle+") = "+triValues[2]);
    }
}
