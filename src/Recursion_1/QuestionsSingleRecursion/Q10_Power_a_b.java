package Recursion_1.QuestionsSingleRecursion;

public class Q10_Power_a_b {
    static void main() {
        int a = 2, b = 4;
        System.out.println(findPower(a, b));
    }

    private static int findPower(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * findPower(a, b - 1);
    }
}
