package Recursion_1.QuestionsSingleRecursion;

public class Q20_Count_Vowels_In_String {
    static void main() {
        String inputString = "coding";
        System.out.println(countVowels(inputString));
    }

    private static int countVowels(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        }
        char ch = inputString.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + countVowels(inputString.substring(1));
        }
        return countVowels(inputString.substring(1));
    }
}
