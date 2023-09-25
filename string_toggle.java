// program for toggle case each character of string
import java.util.*;
public class string_toggle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String a=sc.next();
   // System.out.println("enter 2nd string ");
    //String b=sc.next();
    String k="";
    for(int i=0;i<a.length();i++)
    {
        if(a.charAt(i)>=65 && a.charAt(i)<=90)
            k=k+(char)(a.charAt(i)+32);
        else
            k=k+(char)(a.charAt(i)-32);
    }
    System.out.println(k);
}
}
