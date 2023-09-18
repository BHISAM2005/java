//program for count digit of a no
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            System.out.println("enter a no  ");
            int c=0, n;
            n=sc.nextInt();
            while(n>0){
                n=n/10;
                c=c+1;
            }
            System.out.println("digits in a no = "+c);
        }
    }
