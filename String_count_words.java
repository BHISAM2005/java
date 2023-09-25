//java program to count total number of words in a string
import java.util.*;
public class String_count_words {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int j=0;
    String[] b=str.split(" ");
    for(j=0;j<b.length;j++);
    System.out.println("total no of words in string are "+j);
    }
}