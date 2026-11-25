package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q2_Pattern_Triangle {
    static void main() {
        // will start from this soon
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printPatternTriangle(input);
    }

    private static void printPatternTriangle(int input) {
        int row = 1;
        int totalRows = input;
        int spaces = input - 1;
        int totalNumbers = 1;
        while (row <= totalRows) {
            // space
            int initialSpace = 1;
            while (initialSpace <= spaces) {
                System.out.print("\t");
                initialSpace++;
            }
            // numberPrinting.
            int initialNumber = row;
            int numberStars = 1;
            while (numberStars <= totalNumbers) {
                System.out.print(initialNumber + "\t");
                numberStars++;
                if (numberStars <= row) {
                    initialNumber++;
                } else {
                    initialNumber--;
                }
            }
            System.out.println();
            totalNumbers += 2;
            row++;
            spaces--;
        }
    }
}
