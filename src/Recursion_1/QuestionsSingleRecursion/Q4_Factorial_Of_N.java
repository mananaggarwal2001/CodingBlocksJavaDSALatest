package Recursion_1.QuestionsSingleRecursion;

public class Q4_Factorial_Of_N {
    static void main() {
        int number = 5;
        System.out.println(printFactorialNumber(number));
    }

    private static int printFactorialNumber(int number) {
        if (number == 0) {
            return 1;
        }
        return number * printFactorialNumber(number - 1);
    }
}