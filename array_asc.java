// program to arrange  elements of array in ascending order
import java.util.*;
public class array_asc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int x=0;
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++){
            if (a[i]>a[j]){
                x=a[i];
                a[i]=a[j];
                a[j]=x;
            }
        }
        System.out.println("array in ascending order ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
            
        }
    }