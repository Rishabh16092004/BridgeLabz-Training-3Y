import java.util.Scanner;

public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double volume = Math.PI*Math.pow(radius,2)*height;
        System.out.println("Volume of cylinder: " + volume);

    }
}
