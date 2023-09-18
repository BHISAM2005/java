// program to find  max  elements of array
import java.util.*;
public class max_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int max1;
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        max1=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1)
                max1=a[i];
        }
        //System.out.println("maximum number in array is ");
        System.out.println("maximum no in array is "+max1);
    }
}
    