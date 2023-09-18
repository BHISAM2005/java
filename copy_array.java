// program to copy elements of one array to another array
import java.util.*;
public class copy_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        System.out.println("elements of another array is ");
        for(int i=0;i<a.length;i++)
            System.out.println(b[i]);
    }
}
