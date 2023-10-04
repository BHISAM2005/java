/* One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. 
Participants are usually offered several problems during programming contests. Long before the start the friends 
decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the 
friends won't write the problem's solution.
This contest offers n problems to the participants. For each problem we know, which friend is sure about the 
solution. Help the friends find the number of problems for which they will write a solution.

Input Format
The first input line contains a single integer n — the number of problems in the contest. Then n lines contain 
three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure 
about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the 
third number shows Tonya's view. The numbers on the lines are separated by spaces.
Constraints
1 ≤ n ≤ 1000
Output Format
Print a single integer — the number of problems the friends will implement on the contest.
Sample Input 0
3
1 1 0
1 1 1
1 0 0
Sample Output 0
2
Explanation 0
In the this sample Petya and Vasya are sure that they know how to solve the first problem and all three of 
them know how to solve the second problem. That means that they will write solutions for these problems. 
Only Petya is sure about the solution for the third problem, but that isn't enough, so the friends won't take it.
 */

import java.util.Scanner;
import java.util.*;

public class hackerrank_array_list_1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int c=0,x=0,q=0;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            for(j=0;j<3;j++){
               x=sc.nextInt();
                c=c+x;
            }
            if(c>=2){
                q++;
            }
            c=0;
        }
        System.out.println(q);
    }
}
