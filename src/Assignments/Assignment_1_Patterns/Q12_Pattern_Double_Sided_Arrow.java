package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q12_Pattern_Double_Sided_Arrow {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPatternDoubleSidedArrow(inputNumber);
    }

    private static void printPatternDoubleSidedArrow(int inputNumber) {
        int rows = 1;
        int number = 1;
        int spaces = inputNumber - 1;
        int middleSpaces = 1;
        int totalMiddleSpaces = -1;
        while (rows <= inputNumber) {
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // printNumbers
            int initialNumber = rows <= inputNumber / 2 + 1 ? rows : inputNumber - rows + 1;
            while (initialNumber >= 1) {
                System.out.print(initialNumber + " ");
                initialNumber--;
            }
            // middlespaces.
            int initialMiddleSpaces = 1;
            while (initialMiddleSpaces <= totalMiddleSpaces) {
                System.out.print("  ");
                initialMiddleSpaces++;
            }
            // print end numbers
            int endNumbers = 1;
            if (rows == 1 || rows == inputNumber) {
                endNumbers = 2;
            }
            int printingEndNumbers = rows <= inputNumber / 2 + 1 ? rows : inputNumber - rows + 1;
            while (endNumbers <= printingEndNumbers) {
                System.out.print(endNumbers + " ");
                endNumbers++;
            }
            if (rows <= inputNumber / 2) {
                spaces -= 2;
                totalMiddleSpaces += 2;
            } else {
                spaces += 2;
                totalMiddleSpaces -= 2;
            }
            rows++;
            System.out.println();
        }
    }
}
