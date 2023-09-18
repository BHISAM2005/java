//program to print all odd no bettween 1 and n
import java.util.Scanner;
public class odd_number {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
        System.out.println("enter a no up to n ");
        int i=0, n;
        n=sc.nextInt();
        while(i<=n){
            if (i%2!=0){
            System.out.println(i);}
            i=i+1;

        }
    }
}
