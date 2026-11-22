package Recursion_1.QuestionsSingleRecursion;

public class Q40_Remove_Character_x {
    static void main() {
        String inputString = "xoxo";
        System.out.println(removeCharacterX(inputString, ""));
    }

    private static String removeCharacterX(String inputString, String ans) {
        if (inputString.isEmpty()) {
            return ans;
        }
        char ch = inputString.charAt(0);
        if (ch == 'o') {
            return removeCharacterX(inputString.substring(1), ans + ch);
        }
        return removeCharacterX(inputString.substring(1), ans);
    }
}
