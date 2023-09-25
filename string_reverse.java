// program to reverse a string
import java.util.*;
public class string_reverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st string ");
    String a=sc.next();
    char ch;
    String rev="";

    for(int i=0; i<a.length();i++)
        {ch=a.charAt(i);
        rev=ch+rev;
        }
    System.out.println("Original string = "+a);
    System.out.println("Reverse string = "+rev);
}
}

