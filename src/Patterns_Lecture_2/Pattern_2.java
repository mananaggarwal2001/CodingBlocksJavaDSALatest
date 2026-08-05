package Patterns_Lecture_2;

import java.util.Scanner;

public class Pattern_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int rowTracker = 1;
        // process.
        while (rowTracker <= rows) {
            // printing the stars.
            int stars = 1;
            while (stars <= rowTracker) {
                System.out.print("* ");
                stars++;
            }
            // next line ki preparation
            System.out.println();
            rowTracker++;
        }
    }
}
