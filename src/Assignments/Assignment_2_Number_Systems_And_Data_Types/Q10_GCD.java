package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q10_GCD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        printGCD(number1, number2);
    }

    private static void printGCD(int number1, int number2) {
        int dividend = number1;
        int divisor = number2;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println(divisor);
    }
}
