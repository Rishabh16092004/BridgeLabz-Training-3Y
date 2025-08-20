import java.util.Scanner;

public class Level2_q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int greatestFactor = 1;
        int count = num-1;
        while(count!=1){
            if (num % count == 0) {
                greatestFactor = count;
                break;
            }
            count--;
        }
        System.out.println("The greatest factor of " + num + " is: " + greatestFactor);
    }
}
