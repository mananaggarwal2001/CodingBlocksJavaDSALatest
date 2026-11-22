package Recursion_1.QuestionsSingleRecursion;

public class Q23_LCM_Of_Two_Numbers {
    static void main() {
        int a = 4;
        int b = 6;
        System.out.println(findLCM(a, b));
    }

    private static int findLCM(int dividend, int divisor) {
        int gcd = findGCD(dividend, divisor);
        return (dividend * divisor) / gcd;
    }

    private static int findGCD(int dividend, int divisor) {
        if (dividend % divisor == 0) {
            return divisor;
        }
        return findGCD(divisor, dividend % divisor);
    }
}
