package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Mirror_Pattern_19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int stars = rows / 2 + 1;
        int spaces = -1;
        while (rowTracker <= rows) {
            // star
            int initalStars1 = 1;
            while (initalStars1 <= stars) {
                System.out.print("* ");
                initalStars1++;
            }
            // space
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // star
            int initialStars2 = 1;
            if (rowTracker == rows || rowTracker == 1) {
                initialStars2 = 2;
            }
            while (initialStars2 <= stars) {
                System.out.print("* ");
                initialStars2++;
            }
            // mirror condition
            if (rowTracker <= rows / 2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
            // next Line preparation.
            System.out.println();
            rowTracker++;
        }
    }
}
