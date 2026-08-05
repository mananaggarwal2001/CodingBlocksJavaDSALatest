package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Pattern_21 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // first row preparation then the procedure will be done for the rest of the rows.
        int rows = sc.nextInt();
        int spaces = ((2 * rows) - 3);
        int stars = 1;
        int rowTracker = 1;
        while (rowTracker <= rows) {
            // star printing
            int initialStars1 = 1;
            while (initialStars1 <= stars) {
                System.out.print("* ");
                initialStars1++;
            }
            // space printing.
            int initialspace = 1;
            while (initialspace <= spaces) {
                System.out.print("  ");
                initialspace++;
            }
            // star printing.
            int initialStars2 = 1;
            // for removing the extra star we will put this condition.
            if (rowTracker == rows) {
                initialStars2 = 2;
            }
            while (initialStars2 <= stars) {
                System.out.print("* ");
                initialStars2++;
            }
            System.out.println();
            stars++;
            spaces -= 2;
            rowTracker++;
        }
    }
}
