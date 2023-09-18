// program to read and print all even elements of array
import java.util.*;
public class array_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();// for input
        System.out.println("All even elements of array are");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)  // for even elements
                System.out.println(a[i]);
        }
    }
}
