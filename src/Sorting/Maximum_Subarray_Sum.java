package Sorting;

public class Maximum_Subarray_Sum {
    static void main() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = Maximum_Sum(arr);
        System.out.println(result);
        // In this we will use the moore voting algorithm. For doing the work.
    }
    // this is the number for doing the work and getting the things done.
    public static int Maximum_Sum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    // Kadane algorithm is the algorithm which is used find the maximum subarray sum in which when elements become negative then we start that value with 0.
    public static int Maximum_Sum_Kadane(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}