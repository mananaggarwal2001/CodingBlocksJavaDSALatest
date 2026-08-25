package Math;

import java.util.Scanner;

public class Pascal_Triangle {
    static void main() {
        // this method is the best method for solving the pascal triangle questions and getting the final answer.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int star = 1;
        while (row < n) {
            int i = 0;
            int ncr = 1;
            while (i < star) {
                System.out.print(ncr + "\t");
                ncr = (ncr * (row - i)) / (i + 1);
                i++;
            }
            // next line preparation.
            row++;
            star++;
            System.out.println();
        }
    }
}
