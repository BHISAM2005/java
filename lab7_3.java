// program to print sum of all elements of array
import java.util.*;
public class lab7_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int x=0;
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.println("Elements of array are");
        for(int i=0;i<a.length;i++)
            x=x+a[i];
            System.out.println(x);

    }
}
