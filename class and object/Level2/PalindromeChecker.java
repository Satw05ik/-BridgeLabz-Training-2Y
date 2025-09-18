import java.util.Scanner;

// PalindromeChecker class definition
class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // Remove spaces & ignore case
        int left = 0;
        int right = cleanedText.length() - 1;
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from user
        System.out.print("Enter text to check: ");
        String input = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Display result
        System.out.println();
        checker.displayResult();

        sc.close();
    }
}
