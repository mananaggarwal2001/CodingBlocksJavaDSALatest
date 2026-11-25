package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q2_Count_Digits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        printCountDigits(number, digit);
    }

    private static void printCountDigits(int number, int digit) {
        int countDigit = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == digit) {
                countDigit++;
            }
            number /= 10;
        }
        System.out.println(countDigit);
    }
}
