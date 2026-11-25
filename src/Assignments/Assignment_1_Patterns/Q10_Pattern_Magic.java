package Assignments.Assignment_1_Patterns;

import java.util.Scanner;

public class Q10_Pattern_Magic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printPatternMagic(inputNumber);
    }

    private static void printPatternMagic(int inputNumber) {
        int stars = inputNumber * 2;
        int rows = 1;
        int totalRows = inputNumber * 2 - 1;
        int spaces = -1;
        while (rows <= totalRows) {
            // print stars
            int initialStars = 1;
            while (initialStars <= stars / 2) {
                System.out.print("*");
                initialStars++;
            }
            // int spaces
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print(" ");
                initialSpaces++;
            }
            // print stars
            int finalstars = 1;
            if (rows == 1 || rows == totalRows) {
                finalstars = 2;
            }
            while (finalstars <= stars / 2) {
                System.out.print("*");
                finalstars++;
            }
            if (rows < inputNumber) {
                spaces += 2;
                stars -= 2;
            } else {
                spaces -= 2;
                stars += 2;
            }
            rows++;
            System.out.println();
        }
    }
}
