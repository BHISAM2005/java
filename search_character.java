/*Given a small case character ch and an array containing only the small case alphabets, you have to print 
the index if the character ch is present in the array. If no such character found print -1.
Input Format
● An Character ch ● An integer value representing size of array ● n character value representing elements of array.
Constraints
● 'a'<=ch<='z' ● 1<=n<=100000 ● 'a'<=arr[i]<='z'
Output Format
A Character value
Sample Input 0
d
6
a b c f d e
Sample Output 0
4
Sample Input 1
e
10
a p p l b a n a n a
Sample Output 1
-1
*/
 import java.util.*;
public class search_character{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
    int i=sc.nextInt(),k=0,n=1;
    String temp =sc.nextLine(),s=sc.nextLine();
    for(i=0;i<s.length();i=i+2){
        if(s.charAt(i)==c)
        {
            System.out.println(k);
            n=0;
            break;
        }
        k++;
    }
    if(n==1)
        System.out.println("-1");
    }
}
    