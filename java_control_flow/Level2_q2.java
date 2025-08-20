import java.util.Scanner;
public class Level2_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary=sc.nextInt();
        System.out.print("Enter Years: ");
        int years=sc.nextInt();
        if(years>=5) {
            System.out.println("Your Bonus is: "+salary*0.05);
        }
    }
}
