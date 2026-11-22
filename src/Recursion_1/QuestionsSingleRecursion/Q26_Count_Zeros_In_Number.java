package Recursion_1.QuestionsSingleRecursion;

public class Q26_Count_Zeros_In_Number {
    static void main() {
        int inputNumber = 10020;
        String inputNumberString = Integer.toString(inputNumber);
        System.out.println(countZerosInNumber(inputNumberString));
    }

    private static int countZerosInNumber(String inputNumberString) {
        if (inputNumberString.isEmpty()) {
            return 0;
        }
        char ch = inputNumberString.charAt(0);
        if (ch == '0') {
            return 1 + countZerosInNumber(inputNumberString.substring(1));
        }
        return countZerosInNumber(inputNumberString.substring(1));
    }
}
