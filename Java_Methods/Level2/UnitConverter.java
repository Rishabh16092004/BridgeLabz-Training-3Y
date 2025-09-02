package Level2;
import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example usage
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + UnitConverter.convertKmToMiles(km) + " miles");

        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + UnitConverter.convertMilesToKm(miles) + " km");

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + UnitConverter.convertMetersToFeet(meters) + " feet");

        System.out.print("Enter length in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + UnitConverter.convertFeetToMeters(feet) + " meters");

        sc.close();
    }
}
