package Recursion_1.QuestionsSingleRecursion;

public class Q32_Remove_Duplicates {
    static void main() {
        String str = "aaaaaaaabbbbbbbbbbbccccccccccccc";
        System.out.println(removeDuplicates(str, ""));
    }

    private static String removeDuplicates(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);
        if (!ans.isEmpty()) {
            for (char i : ans.toCharArray()) {
                if (i == ch) {
                    return removeDuplicates(str.substring(1), ans);
                }
            }
        }
        return removeDuplicates(str.substring(1), ans + ch);
    }
}
