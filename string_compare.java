// program to compare 2 string
import java.util.*;
public class string_compare {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st string ");
    String a=sc.next();
    System.out.println("enter 2nd string ");
    String b=sc.next();
    String s=a+b;
    int x=a.compareTo(b);

    if (x==0)
        System.out.println("both string are equal ");
    else
        System.out.println("string are not equal");
    }
}
