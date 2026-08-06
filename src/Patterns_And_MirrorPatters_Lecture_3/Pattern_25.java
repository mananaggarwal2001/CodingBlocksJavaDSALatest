package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Pattern_25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int stars = 1;
        int spaces = rows - 1;
        int count = 1;
        while (rowTracker <= rows) {
            // print spaces.
            int initialSpace = 1;
            while (initialSpace <= spaces) {
                System.out.print("\t");
                initialSpace++;
            }
            // print stars.
            int initialStars = 1;
            while (initialStars <= stars) {
                System.out.print(count + "\t");
                initialStars++;
                count++;
            }
            // nextLine preparation.
            System.out.println();
            rowTracker++;
            stars += 2;
            spaces--;
        }
    }
}
