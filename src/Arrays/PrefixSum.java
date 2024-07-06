package Arrays;

import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] result = prefixSum(array);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private static int[] prefixSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
