import java.util.Scanner;

public class level1_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int possibleHandshakes = (n*(n-1))/2;
        System.out.println("The number of possible handshakes is "+possibleHandshakes);

    }
}
