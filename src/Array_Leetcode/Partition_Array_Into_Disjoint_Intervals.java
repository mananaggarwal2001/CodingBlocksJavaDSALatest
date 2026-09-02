package Array_Leetcode;

import java.util.Arrays;

public class Partition_Array_Into_Disjoint_Intervals {
    static void main() {
        int[] nums = {1, 1};
        int result = partitionDisjoint(nums);
        System.out.println(result);
    }

    public static int partitionDisjoint(int[] nums) {
        int[] maxLeft = new int[nums.length];
        int[] minRight = new int[nums.length];
        maxLeft[0] = nums[0]; // assume that this element is the maximum size element in the left hand side.
        for (int i = 1; i < nums.length; i++) {
            maxLeft[i] = Math.max(nums[i - 1], maxLeft[i - 1]);
        }
        minRight[minRight.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], nums[i + 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (maxLeft[i] <= minRight[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
