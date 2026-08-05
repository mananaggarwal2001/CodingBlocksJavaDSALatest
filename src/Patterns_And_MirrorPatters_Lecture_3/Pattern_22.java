package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Pattern_22 {
    static void main() {
        // for first row.
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int stars = rows;
        int spaces = -1; // as the pattern requires the number of spaces in the odd fashion manner.
        while (rowTracker <= rows) {
            // stars
            int firstStarTracker = 1;
            while (firstStarTracker <= stars) {
                System.out.print("* ");
                firstStarTracker++;
            }
            // spaces
            int spaceTracker = 1;
            while (spaceTracker <= spaces) {
                System.out.print("  ");
                spaceTracker++;
            }
            // stars.
            int secondStarTracker = 1;
            if (rowTracker == 1) {
                secondStarTracker = 2;
            }
            while (secondStarTracker <= stars) {
                System.out.print("* ");
                secondStarTracker++;
            }
            rowTracker++;
            stars--;
            spaces += 2;
            System.out.println();
        }
    }
}