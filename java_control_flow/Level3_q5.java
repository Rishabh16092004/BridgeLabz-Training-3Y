import java.util.Scanner;

public class Level3_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int num = number;
        double sum = 0;
        while(number>0){
            int rem = number % 10;
            sum = sum + Math.pow(rem,3);
            number = number/10;
        }
        if(num == sum){
            System.out.println("The number is a Armstrong number.");
        }
        else{
            System.out.println("The number is not a Armstrong number.");
        }
    }
}
