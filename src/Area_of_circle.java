import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("Area of circle: " + area);
    }
}
