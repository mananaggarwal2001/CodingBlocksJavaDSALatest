package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q7_Pattern_With_Zeros {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        patternWithZeros(inputNumber);
    }

    private static void patternWithZeros(int inputNumber) {
        int row = 1;
        while (row <= inputNumber) {
            int initalstar = 1;
            while (initalstar <= row) {
                if (initalstar == 1 || initalstar == row) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
                initalstar++;
            }
            row++;
            System.out.println();
        }
    }
}
