package Recursion_1.QuestionsSingleRecursion;

public class Q41_Sum_Of_Alternate_Digits {
    static void main() {
        int inputNumber = 1234;
        String inputString = Integer.toString(inputNumber);
        System.out.println(sumofAlternateDigits(inputString, 0, 0));
    }

    private static int sumofAlternateDigits(String inputString, int index, int ans) {
        if (index >= inputString.length()) {
            return ans;
        }
        char ch = inputString.charAt(index);
        ans += Integer.parseInt(String.valueOf(ch));
        return sumofAlternateDigits(inputString, index + 2, ans);
    }
}
