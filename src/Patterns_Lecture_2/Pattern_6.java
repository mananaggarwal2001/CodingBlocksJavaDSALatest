package Patterns_Lecture_2;

import java.util.Scanner;

public class Pattern_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int stars = rows;
        int spaces = 0;
        int rowTracker = 1;
        while (rowTracker <= rows) {
            // print spaces.
            int initalSpace = 1;
            while (initalSpace <= spaces) {
                System.out.print("  ");
                initalSpace++;
            }
            // print stars.
            int initialStars = 1;
            while (initialStars <= stars) {
                System.out.print("* ");
                initialStars++;
            }
            // next Line Preparation.
            System.out.println();
            spaces += 2;
            rowTracker++;
            stars--;
        }
    }
}
