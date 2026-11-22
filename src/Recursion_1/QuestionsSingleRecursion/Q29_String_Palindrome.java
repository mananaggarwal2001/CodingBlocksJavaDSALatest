package Recursion_1.QuestionsSingleRecursion;

public class Q29_String_Palindrome {
    static void main() {
        String inputString = "madam";
        System.out.println(checkPalindromeString(inputString, 0, inputString.length() - 1));
    }

    private static boolean checkPalindromeString(String inputString, int initialIndex, int lastIndex) {
        if (initialIndex == lastIndex) {
            return true;
        }
        // this is the example of the head recursion.
        return inputString.charAt(initialIndex) == inputString.charAt(lastIndex) && checkPalindromeString(inputString, initialIndex + 1, lastIndex - 1);
    }
}
