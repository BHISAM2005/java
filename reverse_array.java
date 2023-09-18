// program to read and print elements of array
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.println("Elements of array in reverse order are ");
        for(int i=n-1;i>=0;i--)
            System.out.println(a[i]);
    }
}
