import java.util.Scanner;

public class Level1_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =  sc.nextInt();
        if(age>=18){
            System.out.println("The person can vote.");
        }
        else{
            System.out.println("The person cannot vote.");
        }
    }
}
