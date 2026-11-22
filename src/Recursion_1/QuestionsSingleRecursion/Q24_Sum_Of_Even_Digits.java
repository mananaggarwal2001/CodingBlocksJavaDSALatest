package Recursion_1.QuestionsSingleRecursion;

public class Q24_Sum_Of_Even_Digits {
    static void main() {
        int input = 1234;
        System.out.println(sumOfEvenDigits(input));
    }

    private static int sumOfEvenDigits(int inputNumber) {
        if (inputNumber == 0) {
            return 0;
        }
        int number = inputNumber % 10;
        if (number % 2 == 0) {
            return number + sumOfEvenDigits(inputNumber / 10);
        }
        return sumOfEvenDigits(inputNumber / 10);
    }
}
