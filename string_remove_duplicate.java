import java.util.*;
public class string_remove_duplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
       String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (r.isEmpty() || c != r.charAt(r.length() - 1)) {
                r += c; }
        }    
        System.out.println(r);

}
}
