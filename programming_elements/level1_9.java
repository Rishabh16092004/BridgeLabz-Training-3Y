import java.util.Scanner;

public class level1_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        int fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt();
        int discount = fee*discountPercent/100;
        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+(fee-discount));
    }
}
