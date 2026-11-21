package Recursion_1.QuestionsSingleRecursion;

public class Q9_Check_Pallindrome_Number {
    static void main() {
        int number = 121;
        System.out.println(checkPallindromeNumber(number));
    }

    private static boolean checkPallindromeNumber(int number) {
        int reverseNumber = findReverseNumber(number, 0);
        return reverseNumber == number;
    }

    private static int findReverseNumber(int number, int result) {
        if (number == 0) {
            return result;
        }
        result *= 10;
        result += number % 10;
        return findReverseNumber(number / 10, result);
    }
}
