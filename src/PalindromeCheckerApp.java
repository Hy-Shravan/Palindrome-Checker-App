public class UseCase2PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam"; // Hardcoded input
        String reversed = "";

        // Logic to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if palindrome
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
