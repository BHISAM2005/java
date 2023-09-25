/*
Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. Aayush and Harshit decides to
 shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 
 3 smartphones, then Harshit purchases 4 smartphones, and so on. Once someone can't purchase more smartphones, 
 he loses.
Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print 
"Aayush" and "Harshit" accordingly.
Input Format
The first line of the input contains an integer T denoting the number of test cases. The description of T 
test cases follows. Two integers M and N denoting the maximum possible number of smartphones Aayush and Harshit 
can purchase respectively.
Constraints
1 ≤ T ≤ 1000 1 ≤ M, N ≤ 10^6
Output Format
For each test case, output a single line containing one string — the name of the winner i.e. Aayush or Harshit
Sample Input
2
9 3    
8 11
Sample Output
Aayush
Harshit
*/

import java.util.*;
public class shopping_game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int a = 0;
            int h = 0;
            int step =1;
            while(true){
                int d = step%2;
                if(d==1){
                    if(a+step<=p){
                        a=a+step;
                    }
                    else{
                        System.out.println("Harshit");
                        break;
                    }
                }
                else{
                    if(h+step<=q){
                        h=h+step;
                    }
                    else{
                        System.out.println("Aayush");
                        break;
                    } 
					}
                step++;
                }
                }
    }
}