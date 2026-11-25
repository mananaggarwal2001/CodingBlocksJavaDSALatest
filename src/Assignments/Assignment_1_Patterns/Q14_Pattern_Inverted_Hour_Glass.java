package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q14_Pattern_Inverted_Hour_Glass {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPatternInvertedHourGlass(inputNumber);
    }

    private static void printPatternInvertedHourGlass(int inputNumber) {
        int number = inputNumber;
        int spaces = inputNumber * 2 - 1;
        int rows = 1;
        int totalRows = inputNumber * 2 + 1;
        while (rows <= totalRows) {
            // print Numbers
            int initialRows = 1;
            int printRows = rows <= inputNumber ? rows : totalRows - rows + 1;
            int printNumber = inputNumber;

            while (initialRows <= printRows) {
                System.out.print(printNumber + " ");
                initialRows++;
                printNumber--;
            }
            // print spaces.
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }

            // final Print number
            printNumber += 1;
            int printFinalRows = rows <= inputNumber ? rows : totalRows - rows + 1;
            int finalRows = 1;
            if (rows == inputNumber + 1) {
                finalRows = 2;
                printNumber += 1;
            }
            while (finalRows <= printFinalRows) {
                System.out.print(printNumber + " ");
                finalRows++;
                printNumber++;
            }
            if (rows <= inputNumber) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
            rows++;
            System.out.println();
        }
    }
}
