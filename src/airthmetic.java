import java.util.Scanner;

public class airthmetic {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =  input.nextInt();
        int b = input.nextInt();
        System.out.println("addition :"+add(a,b));
        System.out.println("subtraction :"+sub(a,b));
        System.out.println("multiplication :"+mul(a,b));
        System.out.println("division :"+div(a,b));
        System.out.println("module :"+mod(a,b));
    }
}
