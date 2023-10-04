import java.io.*;
import java.util.*;
public class pangram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt(),n=0;
    String temp =sc.nextLine(),s=sc.nextLine();
        s=s.toUpperCase();
    for(i=0;i<s.length();i++){
        if((s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
            n++;
       }
       
    if(n>=26)
        System.out.println("YES");
    else
        System.out.println("NO");
    }
}