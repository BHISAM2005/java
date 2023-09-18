// program to check no exist or not elements of array
import java.util.*;
public class array_noexist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.print("Enter a element for search ");
        int x=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
                c=c+1;}
        if (c>0)
            System.out.println("Element exist in array");
        else
            System.out.println("Element not exist in array");
        
        
    }
}
