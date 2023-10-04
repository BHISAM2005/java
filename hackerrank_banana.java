/*A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the 
second one and so on (in other words, he has to pay i·k dollars for the i-th banana).
He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?
Input Format
The first line contains three positive integers k, n, w, the cost of the first banana, initial number of dollars 
the soldier has and number of bananas he wants.
Constraints
1  ≤  k, w  ≤  1000
0 ≤ n ≤ 109
Output Format
Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.
Sample Input 0
3 17 4
Sample Output 0
13 */
import java.io.*;
import java.util.*;
public class hackerrank_banana {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();// for 1st  banana dollar ,2k dollar for 2nd banana
        int n=sc.nextInt();// have n dollars
        int w=sc.nextInt();// buy w banana
        int i=0,c=0,x;
        for(i=1;i<w+1;i++){
            c=c+(i*k);
        }
        if(n>=c)
        {
            System.out.println("0");
        }
        else
            System.out.println(c-n);
    }
}

