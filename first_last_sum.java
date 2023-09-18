import java.util.Scanner;
//program to find sum of first and last digit of a no
public class first_last_sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int c,g, n;
        c=0;//for count digit
        n=sc.nextInt();
        g=n%10;//last digit
        while(n>9){
            n=n/10;}
            c=n%10;//first digit
        
        System.out.println("Sum of first and last digits of a no = "+(c+g));
    }
}
