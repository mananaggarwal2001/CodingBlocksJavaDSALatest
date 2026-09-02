package Array_Leetcode;

public class Find_Middle_Index_In_Array {
    static void main() {
        int[] nums = {2,5};
        System.out.println(findMiddleIndex(nums));
    }

    public static int findMiddleIndex(int[] nums) {
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
