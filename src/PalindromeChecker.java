import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeDeque {
    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);  // insert at rear
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}