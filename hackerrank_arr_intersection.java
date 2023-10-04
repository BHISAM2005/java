/*Given two random integer arrays of size m and n, print their intersection. That is, print all the elements that 
are present in both the given arrays. Input arrays can contain duplicate elements.If no common element is present 
then print -1
Input Format
Line 1 : Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Array 2 Size
Line 4 : Array 2 elements (separated by space)
Constraints
1 <= m, n <= 10^3
Output Format
Print intersection elements in different lines
Sample Input 0
6
2 6 8 5 4 3
4
2 3 4 7
Sample Output 0
2 
4 
3
Sample Input 1
4
2 6 2 1
5
1 2 3 4 2
Sample Output 1
2 
2
1
 */
import java.util.*;
public class hackerrank_arr_intersection {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        int c=sc.nextInt();
        int b[]=new int[c];
        for(int i=0;i<b.length;i++)
            b[i]=sc.nextInt();
        int z=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<c;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    z++;
                    break;
                }
            }
       if(z==0)
           System.out.println("-1");
    }
}
    

