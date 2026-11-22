package Recursion_1.QuestionsSingleRecursion;

public class Q39_Count_Consonants {
    static void main() {
        String numberString = "code";
        System.out.println(countConsonents(numberString, 0, numberString.length()));
    }

    private static int countConsonents(String numberString, int countVowels, int lengthOfString) {
        if (numberString.isEmpty()) {
            return lengthOfString - countVowels;
        }
        char ch = numberString.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return countConsonents(numberString.substring(1), countVowels + 1, lengthOfString);
        }
        return countConsonents(numberString.substring(1), countVowels, lengthOfString);
    }
}
