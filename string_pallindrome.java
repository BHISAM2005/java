// java program to check string is pallindrome or not
import java.util.*;
public class string_pallindrome {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
            r=r+s.charAt(i);
        // System.out.println(r);
        int x=s.compareTo(r);
        if (x==0)
            System.out.println("true");
        else
           System.out.println("false");
    }
}
        