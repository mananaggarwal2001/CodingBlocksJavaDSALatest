package Array_Leetcode;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    static void main() {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArray(array)));
    }

    // combination of the prefix and suffix then do this question we will get the final answer.
    public static int[] productOfArray(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        int[] right = new int[nums.length];
        right[right.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        int[] finalArray = new int[nums.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = left[i] * right[i];
        }
        return finalArray;
    }
}
