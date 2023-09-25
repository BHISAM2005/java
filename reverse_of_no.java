/*

 */
import java.util.*;
public class reverse_of_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no ");
        int n = sc.nextInt();
        int dig,rev=0;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("reverse no is "+rev);
    }
}