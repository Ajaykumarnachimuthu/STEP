import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class UseCase6PalindromeCheckerApp {


    static void main() {


        String input = "civic";


        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }


        boolean isPalindrome = true;


        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}