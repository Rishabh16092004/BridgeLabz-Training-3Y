import java.util.Scanner;

public class level1_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        double quantity =  input.nextDouble();
        System.out.print("The total purchase price is INR " + unitPrice*quantity + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
