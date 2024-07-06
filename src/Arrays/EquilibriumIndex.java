package Arrays;

/*
 * Given an N element array, find the number of equilibrium index. An index i is said to be equilibrium index if the
 * sum of all the elements before ith index == sum of all the elements after the ith index.
 * */

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int[] array = new int[] {-7, 1, 5, 2, -4, 3, 0};

        int result = equilibriumIndex(array);
        System.out.println(result);
    }

    private static int equilibriumIndex(int[] array) {
        int n = array.length;
        int[] prefixLeft = new int[n];
        int[] prefixRight = new int[n];

        prefixLeft[0] = array[0];
        for (int i = 1; i < n; i++) {
            prefixLeft[i] = prefixLeft[i - 1] + array[i];
        }
        prefixRight[n - 1] = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            prefixRight[i] = prefixRight[i + 1] + array[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (prefixRight[i] == prefixLeft[i]) {
                count += 1;
            }
        }
        return count;
    }
}
