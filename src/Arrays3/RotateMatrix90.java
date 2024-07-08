package Arrays3;


public class RotateMatrix90 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before transpose");
        display(matrix);
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
        System.out.println("After rotation ");
        display(matrix);
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reverse(int[] temp) {
        int start = 0;
        int end = temp.length - 1;
        while (start < end) {
            int sec = temp[start];
            temp[start] = temp[end];
            temp[end] = sec;
            start++;
            end--;
        }
    }

    private static void transpose(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j <= i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("After transpose");
        display(matrix);
    }
}
