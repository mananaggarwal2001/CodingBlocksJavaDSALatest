package TwoD_Arrays;

public class Search_In_2D_Matrix {
    static void main() {
        // 74 I have to do from my home
        // 240 I have to do in the class.
        // this question will be done by the stair case search.
        int[][] questionArray = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
    }

    public static boolean stairCaseSearch(int[][] array, int target) {
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
        // we can do this same search from the bottom left column and get the things done.
    }
}