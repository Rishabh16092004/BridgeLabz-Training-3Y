import java.util.Scanner;

public class level1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();
        double distanceInYards = distanceFeet/3;
        double distanceInMiles = distanceInYards/1760;
        System.out.println("The distance in feet is "+ distanceFeet +" while in yards is "+  distanceInYards + " and in Miles is "+ distanceInMiles);
    }
}
