import java.util.LinkedList;

class UseCase8PalindromeCheckerApp {


    static void main() {


        String input = "level";


        LinkedList<Character> list = new LinkedList<>();


        for (char c : input.toCharArray()) {
            list.add(c);
        }


        boolean isPalindrome = true;


        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}