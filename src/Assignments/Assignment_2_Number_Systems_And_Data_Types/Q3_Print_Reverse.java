package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q3_Print_Reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printReverseNumber(inputNumber);
    }

    private static void printReverseNumber(int inputNumber) {
        int resultNumber = 0;
        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            resultNumber = (resultNumber * 10) + remainder;
            inputNumber /= 10;
        }
        System.out.println(resultNumber);
    }
}
