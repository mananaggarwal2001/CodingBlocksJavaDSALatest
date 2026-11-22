package Recursion_1.QuestionsSingleRecursion;

public class Q25_Remove_Zeros_From_Number {
    static void main() {
        int inputNumber = 1020;
        String numberString = Integer.toString(inputNumber);
        System.out.println(outputNumber(numberString, ""));
    }

    private static String outputNumber(String numberString, String ans) {
        if (numberString.isEmpty()) {
            return ans;
        }
        char ch = numberString.charAt(0);
        if (ch != '0') {
            ans += ch;
        }
        return outputNumber(numberString.substring(1), ans);
    }
}
