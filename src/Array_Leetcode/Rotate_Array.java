package Array_Leetcode;

import java.util.Arrays;

public class Rotate_Array {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateReversal(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int j = 0; j < k; j++) {
            // 1st rotation of the array.
            int item = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = item;
        }
    }

    // by using the reversal algorithm for finding the optimized solution.
    public static void rotateReversal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, nums.length - 1); // first we have to reverse the whole array
        reverse(nums, 0, k - 1); // then we will reverse the first portion of the array.
        reverse(nums, k, nums.length - 1); // then we will reverse the remaining portion of the array.
    }

    // this function is for the range reverse for doing the things.
    public static void reverse(int[] nums, int i, int j) {
        int start = i;
        int end = j;
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
