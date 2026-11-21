package Recursion_1.QuestionsSingleRecursion;

public class Q2_Print_Numbers_N_1 {
    static void main() {
        int number = 5;
        printNumber(number);
    }

    private static void printNumber(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        printNumber(number - 1);
    }
}