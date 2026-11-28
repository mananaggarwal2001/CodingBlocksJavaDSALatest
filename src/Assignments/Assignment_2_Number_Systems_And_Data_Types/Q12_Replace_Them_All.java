package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q12_Replace_Them_All {
    static void main() {
        Scanner sc = new Scanner(System.in);
        long inputNumber = sc.nextLong();
        ReplaceThemAll(inputNumber);
    }

    private static void ReplaceThemAll(long inputNumber) {
        String numberString = Long.toString(inputNumber);
        StringBuilder answerString = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '0') {
                answerString.append(5);
            } else {
                answerString.append(numberString.charAt(i));
            }
        }
        System.out.println(answerString);
    }
}
