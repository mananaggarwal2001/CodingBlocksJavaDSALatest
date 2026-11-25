package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q3_Mirror_Star_Pattern_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printMirrorPattern(inputNumber);
    }

    private static void printMirrorPattern(int inputNumber) {
        int star = 1;
        int spaces = inputNumber / 2;
        int row = 1;
        while (row <= inputNumber) {
            // spaces.
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("\t");
                initialSpaces++;
            }
            // stars.
            int initialstars = 1;
            while (initialstars <= star) {
                System.out.print("*\t");
                initialstars++;
            }

            // praparing for the next row.
            if (row <= inputNumber / 2) {
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