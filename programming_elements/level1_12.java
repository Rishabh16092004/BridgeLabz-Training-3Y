import java.util.Scanner;

public class level1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter: ");
        double perimeter = input.nextDouble();
        double sideSquare = perimeter/4;
        System.out.println("The length of the side is "+ sideSquare + " whose perimeter is "+ perimeter);
    }
}
