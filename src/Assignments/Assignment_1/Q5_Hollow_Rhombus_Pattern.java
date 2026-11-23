package Assignments.Assignment_1;

import java.util.Scanner;

public class Q5_Hollow_Rhombus_Pattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printHollowRhombusPattern(inputNumber);
    }

    private static void printHollowRhombusPattern(int inputNumber) {
        int spaces = inputNumber - 1;
        int row = 1;
        int totalRows = inputNumber;
        int stars = inputNumber;
        while (row <= totalRows) {
            int initialSpace = 1;
            while (initialSpace <= spaces) {
                System.out.print(" ");
                initialSpace++;
            }
            // print stars
            int initialstars = 1;
            while (initialstars <= inputNumber) {
//                System.out.print("*");
                if (row == 1 || row == inputNumber || initialstars == 1 || initialstars == inputNumber) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                initialstars++;
            }
            row++;
            spaces--;
            System.out.println();
        }
    }
}
