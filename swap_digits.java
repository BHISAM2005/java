import java.util.Scanner;
//program to swap first and last digit of a no
public class swap_digits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        String s=sc.next();
        char f=s.charAt(0);
        int l=s.length();
        char b=s.charAt(l-1);
        String a=s.substring(1, l-1);
        String j=b+a+f;
        
        System.out.println("number after swap is " +j);
    }
}