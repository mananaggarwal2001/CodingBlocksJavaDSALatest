package Advance_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    static void main() {
        // this is the question about the aggressive cows which is asked in the google.
        // there are total N stalls which is located.
        // there are 2 to N numbers of cows.
        // to find the minimum distance so that 2 cows couldn't able to fight.
        // we have to find the minimum distance so that all cows can sit perfectly and no cows can fight with each other.
        // this is called the hidden search space.
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt(); // number of stalls.
        int noc = sc.nextInt(); // number of cows.
        int[] stall = new int[nos];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall); // NLogN
    }

    public static int largest_minimum_distance(int[] stall, int noc) {
        int ans = 0, lo = 0, high = stall[stall.length - 1] - stall[0];
        while (lo <= high) {
            int mid = (lo + high) / 2;
            if (isItPossible(stall, noc, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // this is for counting the number of cows at min distance.
    private static boolean isItPossible(int[] stall, int noc, int minDistance) {
        int cow = 1; // number of cows will be start from 1.
        int position = stall[0]; // cow sitting at this position okkk.
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - position >= minDistance) {
                position = stall[i];
                cow++;
            }
            if (cow >= noc) {
                return true;
            }
        }
        return false;
    }
}