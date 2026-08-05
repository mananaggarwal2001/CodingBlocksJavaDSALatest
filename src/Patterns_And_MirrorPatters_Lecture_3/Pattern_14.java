package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Pattern_14 {
    static void main() {
        // first row preparation.
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int spaces = rows - 1;
        int stars = 1;
        int totalrows = 2 * rows - 1;
        int rowTracker = 1;
        while (rowTracker <= totalrows) {
            // print number of spaces.
            int initialspaces = 1;
            while (initialspaces <= spaces) {
                System.out.print("  ");
                initialspaces++;
            }
            // print the number of stars
            int initialstars = 1;
            while (initialstars <= stars) {
                System.out.print("* ");
                initialstars++;
            }
            // then mirror condition is applied.
            if (rowTracker < rows) {
                stars++;
                spaces--;
            } else {
                stars--;
                spaces++;
            }
            // next line preparation.
            System.out.println();
            rowTracker++;
        }
    }
}
