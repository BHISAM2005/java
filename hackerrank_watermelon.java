//hackerrank watermelon question of even kilos
import java.util.*;
public class hackerrank_watermelon {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        if((x<=100)&&(x>2)&&(x%2==0)){
        if(x==2)
            System.out.println("NO");
        else
            System.out.println("YES");
            }
        else
            System.out.println("NO");
    }
}