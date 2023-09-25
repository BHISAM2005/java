// program for upper case first character of string
import java.util.*;
public class string_first_upper {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String s=sc.next();
    String a=s;
        char first = a.charAt(0);
        // Convert the first character to upper case
        first = Character.toUpperCase(first);
        // Return the modified string
        a=first + a.substring(1);
        System.out.println("Original: " + s);
        System.out.println("Modified: " + a);
    }
}



