package Array_Leetcode;

public class Trapping_Rain_Water {
    static void main() {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int finalAnswer = trap(arr);
        System.out.println(finalAnswer);
    }

    public static int trap(int[] height) {
        // prefix
        int[] left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        // suffix
        int[] right = new int[height.length];
        right[right.length - 1] = height[height.length - 1];
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // int finding the water capacity and adding the total area in the water.
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += (Math.min(left[i], right[i]) - height[i]);
        }
        return sum;
    }
}
