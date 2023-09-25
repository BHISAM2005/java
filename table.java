//program for table
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a  no for table to be printed ");
        int  n;
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" x "+i+" = "+n*i);
        
    }
}
