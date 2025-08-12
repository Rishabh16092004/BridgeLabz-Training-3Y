import java.sql.SQLOutput;
import java.util.Scanner;

public class logical {
    static boolean gt(int a,int b){
        return a>b;
    }
    static boolean lt(int a,int b){
        return a<b;
    }
    static boolean eq(int a,int b){
        return a==b;
    }
    static boolean neq(int a,int b){
        return a!=b;
    }
    static boolean ge(int a,int b){
        return a>=b;
    }
    static boolean le(int a,int b){
        return a<=b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        int b = input.nextInt();
        System.out.println("a is gt b : "+gt(a,b));
        System.out.println("a is lt b : "+lt(a,b));
        System.out.println("a is neq b : "+eq(a,b));
        System.out.println("a is ge b : "+ge(a,b));
        System.out.println("a is le b : "+le(a,b));
        System.out.println("a is neq e b : "+neq(a,b));
    }
}
