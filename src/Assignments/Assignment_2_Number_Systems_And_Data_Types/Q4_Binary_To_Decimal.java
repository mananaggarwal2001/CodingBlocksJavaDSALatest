package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q4_Binary_To_Decimal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printBinaryToDecimal(inputNumber);
    }

    private static void printBinaryToDecimal(int inputNumber) {
        String inputString = Integer.toString(inputNumber);
        int count = 0;
        int finalresult = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (inputString.charAt(i) - '0' > 0) {
                finalresult = (int) (finalresult + Math.pow(2, count));
            }
            count++;
        }
        System.out.println(finalresult);
    }
}