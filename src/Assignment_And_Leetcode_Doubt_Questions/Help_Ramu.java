package Assignment_And_Leetcode_Doubt_Questions;

import java.util.Scanner;

public class Help_Ramu {
    static void main() {
        sol();
    }

    public static void sol() {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            int t4 = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt(); // n matlab rickshaw and m means cab.
            int[] rickshaw = new int[m];
            int[] cab = new int[n];
            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt();
            }

            int minCostRickshaw = Integer.MAX_VALUE;
            int minCostCab = Integer.MAX_VALUE;
            for (int i = 0; i < rickshaw.length; i++) {
                minCostRickshaw = Math.min(rickshaw[i] * t1, t2); // for finding the cost of the rickshaw and getting the final answer done.
            }
            minCostRickshaw = Math.min(minCostRickshaw, t3);
            for (int i = 0; i < cab.length; i++) {
                minCostCab = Math.min(cab[i] * t1, t2);
            }
            minCostCab = Math.min(t3, minCostCab);
            int total = minCostRickshaw + minCostCab;
            System.out.println(Math.min(total, t4)); // this is the final answer for this code.
        }
    }
}
