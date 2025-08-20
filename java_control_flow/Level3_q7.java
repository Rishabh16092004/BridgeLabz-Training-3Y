import java.util.Scanner;

public class Level3_q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of a person in kg : ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height of a person in cm : ");
        double height = sc.nextDouble();
        height = height * 0.01;
        double BMI = weight / (height * height);
        System.out.println("The BMI is "+BMI);
        if(BMI < 18.4){
            System.out.println("Underweigth");
        }
        else if(BMI>=18.5 && BMI<24.9){
            System.out.println("Normal");
        }
        else if(BMI>=25 && BMI<39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
