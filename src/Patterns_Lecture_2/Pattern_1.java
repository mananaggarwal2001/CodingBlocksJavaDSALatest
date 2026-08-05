package Patterns_Lecture_2;

import java.util.Scanner;

public class Pattern_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = row;
        int rowTracker = 1;
        while (rowTracker <= row) {
            // printing stars.
            int stars = 1;
            while (stars <= col) {
                System.out.print("* ");
                stars++;
            }
            // next line preparation.
            rowTracker++;
            System.out.println();
        }
    }
}
