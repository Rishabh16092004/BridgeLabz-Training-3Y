import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();
        double fahrenheit = ((9.0/5.0)*c)+32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
