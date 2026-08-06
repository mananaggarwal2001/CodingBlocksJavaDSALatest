package Patterns_And_MirrorPatters_Lecture_3;

import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        int spaces = rows - 1;
        int stars = 1;
        int number;
        while (rowTracker <= 2 * rows - 1) {
            int spaceTracker = 1;
            while (spaceTracker <= spaces) {
                System.out.print("\t");
                spaceTracker++;
            }
            int starTracker = 1;
            // horizontal mirroring is done.
            if (rowTracker < rows) {
                number = rowTracker;
            } else {
                number = 2 * rows - rowTracker;
            }
            int printNumber = number;
            while (starTracker <= stars) {
                System.out.print(printNumber + "\t");
                // vertical mirroring.
                if (starTracker < number) {
                    printNumber++;
                } else {
                    printNumber--;
                }
                starTracker++;
            }
            // mirror
            if (rowTracker < rows) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            rowTracker++;
            System.out.println();
        }
    }
}