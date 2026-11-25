package Assignments.Assignment_1;

import java.util.Scanner;

public class Q11_R4_Pattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printR4Pattern(inputNumber);
    }

    private static void printR4Pattern(int inputNumber) {
        int stars = 1;
        int rows = 1;
        while (rows <= inputNumber) {
            int initialstars = 1;
            while (initialstars <= rows) {
                System.out.print("*");
                initialstars++;
            }
            rows++;
            System.out.println();
        }
    }
}
