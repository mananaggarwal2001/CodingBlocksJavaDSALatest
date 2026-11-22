package Recursion_1.QuestionsSingleRecursion;

public class Q28_Decimal_To_Binary {
    static void main() {
        int decimalNumber = 5;
        System.out.println(binaryNumberConversion(decimalNumber, "")); // done with the decimal to binary conversion.
    }

    private static String binaryNumberConversion(int decimalNumber, String ans) {
        if (decimalNumber == 0) {
            return ans;
        }
        ans += decimalNumber % 2;
        return binaryNumberConversion(decimalNumber / 2, ans);
    }
}
