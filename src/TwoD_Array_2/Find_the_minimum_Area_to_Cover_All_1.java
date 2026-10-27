package TwoD_Array_2;

public class Find_the_minimum_Area_to_Cover_All_1 {
    static void main() {
        // In this we have to find the minimum possible area which can contain all the 1's in the rectangle.
        // we have to find minR, minc, maxR, maxC.
        int[][] grid = {{0, 1, 0}, {1, 0, 1}};
        System.out.println(Minimum_Area(grid));
    }

    private static int Minimum_Area(int[][] grid) {
        int minR = Integer.MAX_VALUE, minC = Integer.MAX_VALUE, maxr = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minR = Math.min(minR, i);
                    minC = Math.min(minC, j);
                    maxr = Math.max(maxr, i);
                    maxC = Math.max(maxC, j);
                }
            }
        }
        int area = (maxr - minR + 1) * (maxC - minC + 1);
        return area;
    }
}