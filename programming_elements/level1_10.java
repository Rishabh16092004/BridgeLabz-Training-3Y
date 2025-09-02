import java.util.Scanner;

public class level1_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        double height = input.nextDouble();
        double heightInches = height/2.54;
        double heightFeet = heightInches/12;
        System.out.println("Your height in cm is "+ height +" while in feet is "+ heightFeet +" and inches is "+ heightInches);
    }
}
