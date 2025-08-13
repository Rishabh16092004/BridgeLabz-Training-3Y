import java.util.Scanner;

public class level1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        double kms = km;
        System.out.println("The total miles is "+kms*1.6 +" mile for the given "+ km +" km");
    }
}
