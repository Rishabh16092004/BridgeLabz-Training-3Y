import java.util.Scanner;

public class level1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float Number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float Number2 = input.nextFloat();
        float addition = (Number1+Number2);
        float subtraction = (Number1-Number2);
        float multiplication = (Number1*Number2);
        float division = (Number1/Number2);
        System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+ Number1 + " and " + Number2 + " is " + addition + " , " + subtraction + " , " + multiplication + " and " + division);
    }
}
