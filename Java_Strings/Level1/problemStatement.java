import java.util.Scanner;
import java.util.*;
public class problemStatement {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        sb.append(s);
        System.out.println(sb);
        sb.append(" world");
        System.out.println(sb);
        sb.insert(5,',');
        System.out.println(sb);
        sb.delete(5,6);
        System.out.println(sb);
        sb.replace(6,11,"java");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
//        sb.setLength(50);
        System.out.println(sb.capacity());
        System.out.println(sb.indexOf("j"));
        System.out.println(sb.reverse());
    }
}
