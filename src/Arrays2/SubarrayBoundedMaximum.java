package Arrays2;
/*
 * Given array[n] and 2 integers left and right. Return the number of subarrays such that the value of the maximum subarray element in that subarray is in the range {left, right}.
 *
 *
 * */


import javax.swing.*;
import java.awt.*;

public class SubarrayBoundedMaximum {
    public static void main(String[] args) {

        showImage();

        int[] array = {9,6,8,7,5,4,1,10,6,8};
        int left = 6;
        int right = 8;

        subarrayBoundedMaximum(array, left, right);


    }

    private static void subarrayBoundedMaximum(int[] array, int left, int right) {

    }

    private static void showImage() {
        JFrame frame = new JFrame("Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon icon = new ImageIcon(SubarrayBoundedMaximum.class.getResource("img.png"));
        JLabel label = new JLabel(icon);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
