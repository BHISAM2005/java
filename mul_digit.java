import java.util.Scanner;
//program for multiply of digit of a no
public class mul_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int dig,mul=1, n;
        n=sc.nextInt();
        while(n!=0){
            dig=n%10;
            mul=mul*dig;
            n=n/10;
        }
        System.out.println("multiply of digits of no is "+mul);
        }
    }