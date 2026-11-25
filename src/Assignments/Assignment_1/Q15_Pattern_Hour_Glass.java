package Assignments.Assignment_1;

import java.util.Scanner;

public class Q15_Pattern_Hour_Glass {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printHourGlass(inputNumber);
    }

    private static void printHourGlass(int inputNumber) {
        int rows = 1;
        int totalRows = inputNumber * 2 + 1;
        int spaces = 0;
        int printRows = inputNumber * 2 + 1;
        while (rows <= totalRows) {
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // print number
            int initialNumber = 1;
            int printNumber = rows <= inputNumber ? inputNumber - rows + 1 : rows - inputNumber - 1;
            while (initialNumber <= printRows) {
                System.out.print(printNumber + " ");
                initialNumber++;
                int condition = rows <= inputNumber ? inputNumber - rows + 2 : rows - inputNumber;
                if (initialNumber <= condition) {
                    printNumber--;
                } else {
                    printNumber++;
                }
            }
            if (rows <= inputNumber) {
                spaces++;
                printRows -= 2;
            } else {
                spaces--;
                printRows += 2;
            }
            rows++;
            System.out.println();
        }
    }
}
