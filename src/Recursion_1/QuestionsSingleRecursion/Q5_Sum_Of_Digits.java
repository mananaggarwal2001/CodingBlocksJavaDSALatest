package Recursion_1.QuestionsSingleRecursion;

public class Q5_Sum_Of_Digits {
    static void main() {
        int number = 123;
        System.out.println(SumOfDigits(number));
    }

    private static int SumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + SumOfDigits(number / 10);
    }
}