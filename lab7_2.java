// program to read and print all negative elements of array
import java.util.*;
public class lab7_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.println("All negative elements of array are");
        for(int i=0;i<a.length;i++){
            if(a[i]<0)
                System.out.println(a[i]);
        }
    }
}
