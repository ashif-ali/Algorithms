package Arrays3;

/*
 * Range-sum query 2d from leetcode 304
 * Given a matrix[n][m] and Q queries, for each query find the sub-matrix sum
 * */


public class SubmatrixSum {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int x1 = 0, y1 = 1, x2 = 3, y2 = 3;

        int[][] prefixSumArray = prefixSum(matrix);
        int result = sumRegion(prefixSumArray, x1, y1, x2, y2);
        System.out.println(result);
    }

    private static int sumRegion(int[][] prefixSumArray, int x1, int y1, int x2, int y2) {
        int sum = 0;
        sum += prefixSumArray[x2][y2];
        if (x1 - 1 >= 0) {
            sum -= prefixSumArray[x1 - 1][y2];
        }
        if (y1 - 1 >= 0) {
            sum -= prefixSumArray[x2][y1 - 1];
        }
        if (x1 - 1 >= 0 && y1 - 1 >= 0) {
            sum += prefixSumArray[x1 - 1][y1 - 1];
        }
        return sum;
    }


    private static int[][] prefixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixSumArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) prefixSumArray[i][j] = matrix[i][j];
                else {
                    prefixSumArray[i][j] = prefixSumArray[i][j - 1] + matrix[i][j];
                }
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                prefixSumArray[i][j] = prefixSumArray[i - 1][j] + prefixSumArray[i][j];
            }
        }
        return prefixSumArray;
    }

}
