package Array_Basic;

import java.util.Arrays;

public class Array_Demonstration {
    static void main() {
        int[] arr = new int[10];
        System.out.println(arr); // this will print the address of the initial block in the array where the array is located in the heap memory.
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 10;
        arr[3] = 56;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // this will print the elements in the array in the console.
        }
        for (int j : arr) {
            System.out.println(j); // this will print the elements in the array in the console.
        }
    }
}
