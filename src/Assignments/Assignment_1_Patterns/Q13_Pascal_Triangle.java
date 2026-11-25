package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q13_Pascal_Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPascalTriangle(inputNumber);
    }

    private static void printPascalTriangle(int inputNumber) {
        int row = 0;
        while (row < inputNumber) {
            int col = 0;
            int ncr = 1;
            while (col <= row) {
                System.out.print(ncr + "\t");
                ncr = ((row - col) * ncr) / (col + 1);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
