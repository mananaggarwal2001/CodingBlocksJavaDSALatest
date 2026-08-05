package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;
// Mirror Pattern 1
public class Pattern_13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int totalRows = 2 * rows - 1;
        int rowTracker = 1;
        int stars = 1;
        while (rowTracker <= totalRows) {
            int initalStars = 1;
            while (initalStars <= stars) {
                System.out.print("* ");
                initalStars++;
            }
            if (rowTracker < rows) {
                stars++;
            } else {
                stars--;
            }
            rowTracker++;
            System.out.println();
        }
    }
}
