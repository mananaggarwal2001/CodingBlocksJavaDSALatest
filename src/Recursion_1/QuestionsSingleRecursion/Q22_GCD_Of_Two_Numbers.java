package Recursion_1.QuestionsSingleRecursion;

public class Q22_GCD_Of_Two_Numbers {
    static void main() {
        int dividend = 12;
        int divisor = 18;
        System.out.println(gcdOfTwoNumbers(dividend, divisor));
    }

    private static int gcdOfTwoNumbers(int dividend, int divisor) {
        if (dividend % divisor == 0) {
            return divisor;
        }
        return gcdOfTwoNumbers(divisor, dividend % divisor);
    }
}
