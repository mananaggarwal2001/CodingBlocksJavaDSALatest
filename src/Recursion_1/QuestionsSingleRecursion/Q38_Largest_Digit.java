package Recursion_1.QuestionsSingleRecursion;

public class Q38_Largest_Digit {
    static void main() {
        int inputNumber = 492;
        System.out.println(largestDigit(inputNumber, Integer.MIN_VALUE));
    }

    private static int largestDigit(int inputNumber, int largestAnswer) {
        if (inputNumber == 0) {
            return largestAnswer;
        }
        int digit = inputNumber % 10;
        largestAnswer = Math.max(largestAnswer, digit);
        return largestDigit(inputNumber / 10, largestAnswer);
    }
}
