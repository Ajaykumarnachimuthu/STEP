import java.util.ArrayDeque;
import java.util.Deque;

class UseCase7PalindromeCheckerApp {


    static void main() {


        String input = "refer";


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toCharArray()) {
            deque.add(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}