package Level2;
import java.util.Scanner;
public class UnitConverter_5 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + UnitConverter_5.convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + UnitConverter_5.convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + UnitConverter_5.convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + UnitConverter_5.convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + UnitConverter_5.convertInchesToCm(inches) + " cm");

        sc.close();
    }
}
