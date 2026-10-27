package TwoD_Array_2;

public class Spiral_Print {
    static void main() {
        int[][] array = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        SpiralPrint(array);
    }

    private static void SpiralPrint(int[][] array) {
        int minr = 0, maxr = array.length - 1, minc = 0, maxc = array[0].length - 1;
        int totalElement = array.length * array[0].length;
        int count = 0;
        while (count < totalElement) {
            for (int i = minc; i <= maxc && count < totalElement; i++) {
                System.out.print(array[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count < totalElement; i++) {
                System.out.print(array[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count < totalElement; i--) {
                System.out.print(array[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < totalElement; i--) {
                System.out.print(array[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}