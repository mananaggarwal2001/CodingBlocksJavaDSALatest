package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q11_Chewbacca_And_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(chewbaccaAndNumber(inputString));
    }

    private static String chewbaccaAndNumber(String inputNumber) {
        // Skip leading zeros, but keep at least one digit for showing the answer as if the edge case is 0.
        int start = 0;
        while (start < inputNumber.length() - 1 && inputNumber.charAt(start) == '0') {
            start++;
        }
        // Now after removing the leading 0's then the final answer will start for this question.
        inputNumber = inputNumber.substring(start);
        StringBuilder changedNumber = new StringBuilder();
        for (int i = 0; i < inputNumber.length(); i++) {
            int digit = inputNumber.charAt(i) - '0';
            int inverted = 9 - digit;
            if (i == 0 && digit == 9) {
                changedNumber.append(9);
            } else {
                changedNumber.append(Math.min(digit, inverted));
            }
        }
        return changedNumber.toString();
    }
}
