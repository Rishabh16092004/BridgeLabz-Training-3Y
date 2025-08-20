import java.util.Scanner;

public class Level3_q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int number = scan.nextInt();
        int count = 0;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("The number "+number+" is prime number");
        }
        else{
            System.out.println("The number "+number+" is not prime number");
        }
    }
}
