package Recursion_1.QuestionsSingleRecursion;

public class Q1_Print_Numbers_1_N {
    static void main() {
        int number = 5;
        printNumber(number);
    }

    private static void printNumber(int number) {
        if (number == 0) {
            return;
        }
        printNumber(number - 1);
        System.out.println(number);
    }
}