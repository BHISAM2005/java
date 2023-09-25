//java program to find total number of alphabets, digits or special character in a string
import java.util.*;
public class string_no_alpha {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String a=sc.next();
   // System.out.println("enter 2nd string ");
    //String b=sc.next();
    // k is for alphabet,d is for digit, s is for special character
    int k=0,d=0,s=0;
    for(int i=0;i<a.length();i++)
    {
        if((a.charAt(i)>=65 && a.charAt(i)<=90)||(a.charAt(i)>=97 && a.charAt(i)<=122))
            k++;
        else
        {
            if(a.charAt(i)>='0' && a.charAt(i)<='9')
            d++;
            else
            s++;
        }
    }
    System.out.println("the total number of alphabet in "+k);
    System.out.println("the total number of digits in "+d);
    System.out.println("the total number of special character in "+s);
}
}
