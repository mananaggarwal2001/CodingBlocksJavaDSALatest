package Recursion_1;

public class Array_IsSorted {
    static void main() {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // the condition is check when the stack is growing.
        return isSorted(arr, index + 1);
        // head recursion and tail recursion
        // head recursion me stack girte waqt kaam hota hain
        // tail recursion me stack girte waqt koi kaam nhi hota hain.

    }

//    private static boolean isSorted(int[] arr, int index) {
//        if (index + 1 == arr.length) {
//            return true;
//        }
//        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1); // this is the condition that is the and condition for getting the things done.
//    }
}
