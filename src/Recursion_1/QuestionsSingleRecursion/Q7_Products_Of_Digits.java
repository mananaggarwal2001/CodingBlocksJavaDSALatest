package Recursion_1.QuestionsSingleRecursion;

public class Q7_Products_Of_Digits {
    static void main() {
        int number = 234;
        System.out.println(productOfDigits(number));
    }

    private static int productOfDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return number % 10 * productOfDigits(number / 10);
    }
}
