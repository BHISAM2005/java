// program to print natural number in reaverse order up to n
import java.util.*;
public class natural{
    public static void main(String[] args) {
         int i, n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no up to n ");
        n=sc.nextInt();
        i=n;
        while(i>0){
            System.out.println(i);
            i=i-1;

        }
        
    }
}
