//Write a java program to reverse order of words in a given string.
import java.util.Scanner;
public class string_words_reverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");
    String str=sc.nextLine();
    String[] b=str.split(" ");
    StringBuilder output = new StringBuilder();
    for(int i =b.length-1; i >= 0; i--)
    {output.append(b[i]).append(" ");}
    output.deleteCharAt(output.length() - 1);
    System.out.println("The reversed string is:");
    System.out.println(output);
    }
}
    

