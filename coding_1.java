import java.util.*;
public class coding_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String [] b= s.split("");
        for(int i=0;i<s.length()+1;i++)
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
               b=s.split (" ");

        System.out.println(b);

    }
}