package Patterns_Lecture_2;

import java.util.Scanner;

public class Pattern_4 {
    static void main() {
        // first row ki preparation.
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int spaces = rows - 1;
        int stars = 1;
        // nextLine ki preparation.
        while (rowTracker <= rows) {
            // print space.
            int initialspace = 1;
            while (initialspace <= spaces) {
                System.out.print("  ");
                initialspace++;
            }
            // print stars.
            int initialstars = 1;
            while (initialstars <= stars) {
                System.out.print("* ");
                initialstars++;
            }
            // next line preparation.
            System.out.println();
            rowTracker++;
            spaces--;
            stars++;
        }
    }
}
