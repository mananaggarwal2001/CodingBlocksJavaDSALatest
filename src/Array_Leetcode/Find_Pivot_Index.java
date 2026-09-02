package Array_Leetcode;

import java.util.Arrays;

public class Find_Pivot_Index {
    static void main() {
        int[] nums = {0,0};
        int result = pivotIndex(nums);
        System.out.println(result);
    }

    public static int pivotIndex(int[] nums) {
        int[] leftEdge = new int[nums.length];
        int[] rightEdge = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            leftEdge[i] = leftEdge[i - 1] + nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightEdge[i] = rightEdge[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftEdge[i] == rightEdge[i]) {
                return i;
            }
        }
        return -1;
    }
}
