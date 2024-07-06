package Arrays3;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/*
* Transpose the given n*n matrix
* */

public class TransposeMatrix {

    public static void main(String[] args) {
//        showImage();
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};
        System.out.println("Before transpose");
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrix);
    }

    private static void transpose(int[][] matrix) {
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 0; j <= i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("After transpose");
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void showImage() {
        JFrame frame = new JFrame("Transpose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 900);

        ImageIcon icon = new ImageIcon(TransposeMatrix.class.getResource("img.png"));
        JLabel label = new JLabel(icon);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
