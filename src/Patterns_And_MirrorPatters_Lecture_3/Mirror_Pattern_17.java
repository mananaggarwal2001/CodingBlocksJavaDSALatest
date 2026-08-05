package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Mirror_Pattern_17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int stars = rows / 2;
        int spaces = 1;
        int rowTracker = 1;
        while (rowTracker <= rows) {
            // print stars
            int initialstars = 1;
            while (initialstars <= stars) {
                System.out.print("* ");
                initialstars++;
            }
            // print spaces
            int initialspaces = 1;
            while (initialspaces <= spaces) {
                System.out.print("  ");
                initialspaces++;
            }
            // print stars.
            int initialstars2 = 1;
            while (initialstars2 <= stars) {
                System.out.print("* ");
                initialstars2++;
            }
            if (rowTracker < rows / 2 + 1) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
            rowTracker++;
            System.out.println();
        }
    }
}
