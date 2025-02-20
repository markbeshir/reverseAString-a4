public class ReverseAString {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Create a StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        
        // Print the reversed string
        System.out.println(reversed.toString());
        
        // Close the scanner
        scanner.close();
    }
}
