package Recursion_1.QuestionsSingleRecursion;

public class Q31_Replace_Characters {
    static void main() {
        String characterString = "cat";
        System.out.println(replaceCharacter(characterString, ""));
    }

    private static String replaceCharacter(String characterString, String ans) {
        if (characterString.isEmpty()) {
            return ans;
        }
        char ch = characterString.charAt(0);
        if (ch == 'a') {
            return replaceCharacter(characterString.substring(1), ans + 'o');
        }
        return replaceCharacter(characterString.substring(1), ans + ch);
    }
}
