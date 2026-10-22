package TwoD_Arrays;

import java.util.Arrays;

// we have to find the transpose of the matrix.
// we have to change the original matrix.
public class Transpose_Matrix {
    static void main() {
        int[][] numberArray = {
                {2, 5, 7, 9},
                {1, 3, 11, 6},
                {8, 4, 10, 12},
                {12, 13, 14, 15}
        };
        Transpose(numberArray);
        // do the question which is rotate image in the array.
        // do the rotate array leetcode question from the home.
    }

    public static void Transpose(int[][] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
