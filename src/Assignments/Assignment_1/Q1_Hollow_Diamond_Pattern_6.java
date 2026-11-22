package Assignments.Assignment_1;

import java.util.Scanner;

public class Q1_Hollow_Diamond_Pattern_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        hollowDiamondPattern(inputNumber);
    }

    private static void hollowDiamondPattern(int inputNumber) {
        int rows = 1;
        int stars = inputNumber + 1;
        int spaces = -1;
        while (rows <= inputNumber) {
            int initialStars = 1;
            while (initialStars <= (stars / 2)) {
                System.out.print("*\t");
                initialStars++;
            }
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("\t");
                initialSpaces++;
            }
            int finalStars = 1;
            if (rows == 1 || rows == inputNumber) {
                finalStars = 2;
            }
            while (finalStars <= stars / 2) {
                System.out.print("*\t");
                finalStars++;
            }
            // next row ki preparation.
            if (rows <= (inputNumber / 2)) {
                stars -= 2;
                spaces += 2;
            } else {
                stars += 2;
                spaces -= 2;
            }
            System.out.println();
            rows++;
        }
    }
}
