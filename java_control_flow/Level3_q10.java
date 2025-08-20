import java.util.Scanner;

public class Level3_q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number : ");
        int num2 = input.nextInt();
        boolean running = true;
        while(running){
            int choice = input.nextInt();
            if(choice ==6){
                running = false;
                continue;
            }

            switch(choice){
                case 1:
                    System.out.print("addition :"+num1+num2);
                    break;
                case 2:
                    System.out.print("subtraction :"+ (num1-num2));
                    break;
                case 3:
                    System.out.print("multiplication :"+num1*num2);
                    break;
                case 4:
                    System.out.print("division :"+num1/num2);
                    break;
                case 5:
                    System.out.print("remainder :"+num1/num2);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
