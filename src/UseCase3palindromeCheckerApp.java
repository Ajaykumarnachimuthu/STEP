public class UseCase3palindromeCheckerApp {
    static void main() {


        String input = "madam";


        StringBuilder reversed = new StringBuilder();


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }


        if (input.contentEquals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
