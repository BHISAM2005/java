// program to read and print elements of array
import java.util.*;
public class lab7_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.println("Elements of array are");
        for(int i=0;i<a.length;i++){
            System.out.printf("a[%d]=%d \n",i,a[i]); // another method to print array using c
            // System.out.println(a[i]);
        }
    }
}
