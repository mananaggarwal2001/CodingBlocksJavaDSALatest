package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q5_LCM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber1 = sc.nextInt();
        int inputNumber2 = sc.nextInt();
        findLCM(inputNumber1, inputNumber2);

    }

    private static void findLCM(int inputNumber1, int inputNumber2) {
        int findGCD = GCDNumber(inputNumber1, inputNumber2);
        int lcm = (inputNumber1 * inputNumber2) / findGCD;
        System.out.println(lcm);
    }

    private static int GCDNumber(int inputNumber1, int inputNumber2) {
        int dividend = inputNumber1;
        int divisor = inputNumber2;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }
}
