import java.util.Scanner;

public class Level2_q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amar age: ");
        int amarage = scan.nextInt();
        System.out.print("Enter amar height: ");
        double amarheight = scan.nextDouble();
        System.out.print("Enter Akbar age: ");
        int Akbarage = scan.nextInt();
        System.out.print("Enter Akbar height: ");
        double AkbarHeight = scan.nextDouble();
        System.out.print("Enter Anthony age: ");
        int Anthonyage = scan.nextInt();
        System.out.print("Enter Anthony height: ");
        double AnthonyHeight = scan.nextDouble();
        if(amarage<Akbarage && amarage<Anthonyage){
            System.out.println("Amar is youngest");
        }
        else if(Akbarage<Anthonyage && Akbarage<amarage){
            System.out.println("Akbar is youngest");
        }
        else{
            System.out.println("Anthony is youngest");
        }

        if(amarheight>AkbarHeight && amarheight>AnthonyHeight){
            System.out.println("Amar is tallest");
        }
        else if(AkbarHeight>amarheight && AkbarHeight>AnthonyHeight){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Anthony is tallest");
        }
    }
}
