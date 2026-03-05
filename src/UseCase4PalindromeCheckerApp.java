class UseCase4PalindromeCheckerApp {


    static void main() {


        String input = "madam";


        char[] characters = input.toCharArray();


        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }


        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}