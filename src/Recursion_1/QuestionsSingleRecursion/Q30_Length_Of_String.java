package Recursion_1.QuestionsSingleRecursion;

public class Q30_Length_Of_String {
    static void main() {
        String inputString = "Hello";
        System.out.println(findLengthOfString(inputString));
    }

    private static int findLengthOfString(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        }
        return 1 + findLengthOfString(inputString.substring(1));
    }
}
