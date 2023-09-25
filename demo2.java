// A class to demonstrate the program
public class demo2 {

    // A method to convert the first character of a string to upper case
    public static String upperCaseFirst(String s) {
        // Check if the string is null or empty
        if (s == null || s.isEmpty()) {
            return s; // Return the original string
        }
        // Get the first character of the string
        char first = s.charAt(0);
        // Check if the first character is already upper case
        if (Character.isUpperCase(first)) {
            return s; // Return the original string
        }
        // Convert the first character to upper case
        first = Character.toUpperCase(first);
        // Return the modified string
        return first + s.substring(1);
    }

    // A main method to test the program
    public static void main(String[] args) {
        // Use a scanner to get the input string from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        // Print the original and modified strings
        System.out.println("Original: " + input);
        System.out.println("Modified: " + upperCaseFirst(input));
    }
}
