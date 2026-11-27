package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q6_Nth_Fibonacci_Hard {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.println(printNthFibonacci(inputNumber));
    }

    private static int printNthFibonacci(int inputNumber) {
        int firstNumber = 0;
        int secondNumber = 1;
        if (inputNumber == 0) {
            return firstNumber;
        }
        if (inputNumber == 1) {
            return secondNumber;
        }
        int result = 0;
        while (inputNumber >= 2) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
            inputNumber--;
        }
        return result;
    }
}
