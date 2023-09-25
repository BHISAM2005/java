//java program to count total number of words in a string
import java.util.*;
public class string_words {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String str=sc.next();
    int i=0;
    String [] b=str.split (" ");
    for(i=0;i<b.length;i++)
        i++;

   // System.out.println("enter 2nd string ");
    //String b=sc.next();
   /*  int w=0,i=0;
    while(i<str.length())
    {if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
    {w++;}
        i++;
        System.out.println(i);
    }*/
    System.out.println("Total no of words are "+(i+1));
}
}
