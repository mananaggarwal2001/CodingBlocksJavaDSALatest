package TwoD_Arrays;

public class Wave_Print {
    static void main() {
        int[][] numberArray = {{2, 5, 7, 9}, {1, 3, 11, 6}, {8, 4, 10, 12}};
        WavePrint(numberArray);
    }

    private static void WavePrint(int[][] numberArray) {
        // outer loop is the column that we have to fix this and work this as the row.
        for (int i = 0; i < numberArray[0].length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (i % 2 == 0) {
                    System.out.print(numberArray[j][i] + " ");
                } else {
                    System.out.print(numberArray[numberArray.length - j - 1][i] + " ");
                }
            }
        }
    }
}
