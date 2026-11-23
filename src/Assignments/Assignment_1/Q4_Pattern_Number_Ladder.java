package Assignments.Assignment_1;

import java.util.Scanner;

public class Q4_Pattern_Number_Ladder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPatternNumberLadder(inputNumber);
    }

    private static void printPatternNumberLadder(int inputNumber) {
        int count = 1;
        int row = 1;
        while (row <= inputNumber) {
            int initalNumber = 1;
            while (initalNumber <= row) {
                System.out.print(count + "\t");
                count++;
                initalNumber++;
            }
            // next line preparation.
            System.out.println();
            row++;
        }
    }
}
