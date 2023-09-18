// program to find second max  elements of array
import java.util.*;
public class second_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int max1,max2;
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        max1=max2=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1)
                max2=max1;
                max1=a[i];
            
        }
        //System.out.println("maximum number in array is ");
        System.out.println("2nd maximum no in array is "+max2);
    }
}