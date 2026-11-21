package Recursion_1.QuestionsSingleRecursion;

public class Q8_Reverse_A_Number {
    static void main() {
        int number = 123;
        System.out.println(reverseNumber(number, 0));
    }

    private static int reverseNumber(int number, int result) {
        if (number == 0) {
            return result;
        }
        result *= 10;
        result += number % 10;
        return reverseNumber(number / 10, result);
    }
}
