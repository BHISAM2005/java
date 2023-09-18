import java.util.Scanner;
//program for sum of digit of a no
public class sum_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int dig,sum=0, n;
        n=sc.nextInt();
        while(n!=0){
            dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        System.out.println("sum of digits of no is "+sum);
        }
    }