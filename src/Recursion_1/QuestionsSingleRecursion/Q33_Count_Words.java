package Recursion_1.QuestionsSingleRecursion;

public class Q33_Count_Words {
    static void main() {
        String inputString = "I love Code";
        System.out.println(countWords(inputString));
    }

    private static int countWords(String inputString) {
        if (inputString.isEmpty()) {
            return 1;
        }
        char ch = inputString.charAt(0);
        if (ch == ' ') {
            return 1 + countWords(inputString.substring(1));
        }
        return countWords(inputString.substring(1));
    }
}
