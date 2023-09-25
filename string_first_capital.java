// java program to capitalize first character of String
import java.util.*;
public class string_first_capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str =sc.nextLine();
        String a=str;
        char f=a.charAt(0);
        f=Character.toUpperCase(f);
        a=f+a.substring(1);
        System.out.println(a);
    }
}