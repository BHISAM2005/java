// program to read and print elements of array
import java.util.*;
public class max_min_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int max,min;
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        max=min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }
        System.out.println("maximum number in array is "+max);
        System.out.println("minimum no in array is "+min);
    }
}