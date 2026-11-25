package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q8_Fibonacci_Pattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printFibonacciPattern(inputNumber);
    }

    private static void printFibonacciPattern(int inputNumber) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = firstNumber + secondNumber;
        if (inputNumber == 1) {
            System.out.println(firstNumber);
            return;
        }
        if (inputNumber == 2) {
            System.out.println(firstNumber);
            System.out.print(secondNumber + "\t");
            System.out.print(thirdNumber);
            return;
        }
        System.out.println(firstNumber);
        System.out.print(secondNumber + "\t");
        System.out.print(thirdNumber);
        System.out.println();
        int row = 3;
        while (row <= inputNumber) {
            int printStars = 1;
            while (printStars <= row) {
                int result = secondNumber + thirdNumber;
                System.out.print(result + "\t");
                secondNumber = thirdNumber;
                thirdNumber = result;
                printStars++;
            }
            row++;
            System.out.println();
        }
    }
}
