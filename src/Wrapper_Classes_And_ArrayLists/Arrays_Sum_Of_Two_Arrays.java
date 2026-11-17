package Wrapper_Classes_And_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_Sum_Of_Two_Arrays {
    static void main() {
        int[] a1 = {1, 0, 2, 9};
        int[] a2 = {3, 4, 5, 6, 7};
        findTheSum(a1, a2);
    }

    private static void findTheSum(int[] a1, int[] a2) {
        reverseArray(a1);
        reverseArray(a2);
        ArrayList<Integer> list = new ArrayList<>();
        int minSize = Math.min(a1.length, a2.length);
        int carry = 0;
        for (int i = 0; i < minSize; i++) {
            int sum = a1[i] + a2[i] + carry;
            carry = sum / 10;
            list.add(sum % 10);
        }
        // for remaining arrays.
        for (int i = minSize; i < a1.length; i++) {
            int sum = a1[i] + carry;
            carry = sum / 10;
            list.add(sum % 10);
        }
        for (int i = minSize; i < a2.length; i++) {
            int sum = a2[i] + carry;
            carry = sum / 10;
            list.add(sum % 10);
        }
        if (carry != 0) {
            list.add(carry);
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void reverseArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    // leetcode question plus 1.
}
