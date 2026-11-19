package Recursion_1;

public class Count_Vowels {
    static void main() {
        String s = "coding";
        int result = countVowelsRecursion(s, 0); // head recursion is used for doing this question.
        int result2 = countVowelsRecursion2(s);
        System.out.println(result);
        System.out.println(result2);
    }

    private static int countVowelsRecursion(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o' || s.charAt(index) == 'u') {
            return 1 + countVowelsRecursion(s, index + 1);
        }
        return countVowelsRecursion(s, index + 1);
    }

    private static int countVowelsRecursion2(String s) {
        // we are reducing the String in this function and this is the second method for doing this question.
        if (s.isEmpty()) {
            return 0;
        }
        char ch = s.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + countVowelsRecursion2(s.substring(1));
        }
        return countVowelsRecursion2(s.substring(1));
    }
}
