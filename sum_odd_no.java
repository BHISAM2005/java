import java.util.Scanner;
// program for sum of all odd no between given range
public class sum_odd_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no up to n ");
        int i=0,s=0, n;
        n=sc.nextInt();
        while(i<=n){
            if (i%2!=0){
            //System.out.println(i);}
            s=s+i;}
            i=i+1;
        }
        System.out.println("sum of given odd no is "+s);
}
}