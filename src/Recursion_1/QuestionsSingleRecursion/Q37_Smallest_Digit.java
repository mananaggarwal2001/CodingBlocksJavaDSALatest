package Recursion_1.QuestionsSingleRecursion;

public class Q37_Smallest_Digit {
    static void main() {
        int inputNumber = 492;
        System.out.println(smallestDigit(inputNumber, Integer.MAX_VALUE));
    }

    private static int smallestDigit(int inputNumber, int smallestAnswer) {
        if (inputNumber == 0) {
            return smallestAnswer;
        }
        int digit = inputNumber % 10;
        smallestAnswer = Math.min(smallestAnswer, digit);
        return smallestDigit(inputNumber / 10, smallestAnswer);
    }
}
