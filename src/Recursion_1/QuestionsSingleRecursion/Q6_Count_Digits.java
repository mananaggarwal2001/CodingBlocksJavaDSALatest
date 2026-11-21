package Recursion_1.QuestionsSingleRecursion;

public class Q6_Count_Digits {
    static void main() {
        int digits = 9876;
        System.out.println(countDigits(digits));
    }

    private static int countDigits(int digits) {
        if (digits == 0) {
            return 0;
        }
        return 1 + countDigits(digits / 10);
    }

}
