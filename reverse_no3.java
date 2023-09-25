import java.util.Scanner;
//program to reverse digit of a no
public class reverse_no3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int dig,rev=0, n;
        n=sc.nextInt();
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("reverse no is "+rev);
        }
    }