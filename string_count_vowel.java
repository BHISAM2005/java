//java program to count total number of vowels and consonants in a string
import java.util.*;
public class string_count_vowel {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String str=sc.next();
   // System.out.println("enter 2nd string ");
    //String b=sc.next();
    int v=0,c=0;
    String k="";
    for(int i=0;i<str.length();i++)
    {
        if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
               str.charAt(i) =='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'  )
                v++;
            else
                c++;
        }
    }
    System.out.println("Vowel are "+v);
    System.out.println("consonent are "+c);
}
}
