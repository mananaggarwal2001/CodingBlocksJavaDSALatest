package Assignments.Assignment_1;

import java.util.Scanner;

public class Q9_Pattern_Mountain {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        patternMountain(inputNumber);
    }

    private static void patternMountain(int inputNumber) {
        int star = 1;
        int row = 1;
        int spaces = (inputNumber * 2) - 3;
        while (row <= inputNumber) {
            // number
            int initialNumber = 1;
            while (initialNumber <= row) {
                System.out.print(initialNumber + "\t");
                initialNumber++;
            }
            // spaces.
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("\t");
                initialSpaces++;
            }
            // number
            int finalNumber = initialNumber - 1;
            int finalNumberPrinting = 1;
            if (row == inputNumber) { // condition for the last row for avoiding the extra number which is printing in the last row.
                finalNumberPrinting = 2;
                finalNumber = initialNumber - 2;
            }
            while (finalNumberPrinting <= row) {
                System.out.print(finalNumber + "\t");
                finalNumber--;
                finalNumberPrinting++;
            }
            // next row preparation.
            System.out.println();
            spaces -= 2;
            row++;
        }
    }
}
