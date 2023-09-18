import java.util.Scanner;
//program to reverse digit of a no
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no ");
        int dig,rev=0,g,n;
        n=sc.nextInt();
        g=n;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        //System.out.println("reverse no is "+rev);
        if(rev==g){
            System.out.println("given no is pallindrome");
        }
        else{
            System.out.println("given no is not pallindrome");
        }
        }
    }