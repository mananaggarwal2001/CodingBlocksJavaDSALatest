package Assignments.Assignment_1;

import java.util.Scanner;

public class Q6_Pattern_Rhombus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPatternRhombus(inputNumber);
    }

    private static void printPatternRhombus(int inputNumber) {
        int star = 1;
        int spaces = inputNumber - 1;
        int row = 1;
        int totalRows = (inputNumber * 2) - 1;
        while (row <= totalRows) {
            // spaces.
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("\t");
                initialSpaces++;
            }
            // stars.
            int initialstars = 1;
            int count = row <= inputNumber ? row : totalRows - row + 1;
            while (initialstars <= star) {
                System.out.print(count + "\t");
                int rowTracker = row <= inputNumber ? row : totalRows - row + 1;
                if (initialstars < rowTracker) {
                    count++;
                } else {
                    count--;
                }
                initialstars++;
            }

            // praparing for the next row.
            if (row < inputNumber) {
                star += 2;
                spaces--;
            } else {
                star -= 2;
                spaces++;
            }
            row++;
            System.out.println();
        }
    }
}
