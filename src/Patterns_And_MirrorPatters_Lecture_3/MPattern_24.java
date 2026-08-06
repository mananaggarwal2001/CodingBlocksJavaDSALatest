package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class MPattern_24 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int stars = 1;
        int spaces = rows - 1;
        while (rowTracker <= rows) {
            // print spaces.
            int initialSpace = 1;
            while (initialSpace <= spaces) {
                System.out.print("  ");
                initialSpace++;
            }
            // print stars.
            int initialStars = 1;
            while (initialStars <= stars) {
                System.out.print("1 ");
                initialStars++;
            }
            // nextLine preparation.
            System.out.println();
            rowTracker++;
            stars += 2;
            spaces--;
        }
    }
}
