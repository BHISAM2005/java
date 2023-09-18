import java.util.Scanner;
//program to find first and last digit of a no
public class first_last {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int c,g, n;
        c=0;
        n=sc.nextInt();
        g=n%10;
        while(n>9){
            n=n/10;}
            c=n%10;
        
        System.out.println("last digits is = "+g);
        System.out.println("first digits is = "+c);
    }
}
