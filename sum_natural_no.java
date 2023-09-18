import java.util.Scanner;
// program for sum of all natural no between given range
public class sum_natural_no {
    public static void main(String[] args) {
        int i=0,s,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no up to n ");
        n=sc.nextInt();
        s=0;
        while(i<=n){
            //System.out.println(i);
            s=s+i;
            i=i+1;
    }
    System.out.println("sum of given natural no is = "+s);
    
}
}
