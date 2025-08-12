import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("sum: ");
        System.out.println(a+b);
    }
}
