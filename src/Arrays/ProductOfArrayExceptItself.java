package Arrays;
import java.util.Arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        // Call the method and get the result
        int[] result = productOfArrayExceptItself(array);

        // Print the result
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Product of array except itself: " + Arrays.toString(result));

    }

    private static int[] productOfArrayExceptItself(int[] array) {
        int n = array.length;
        int[] prefixProduct = new int[n];
        prefixProduct[0] = array[0];
        for(int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i-1] * array[i];
        }
        int rightProduct = 1;
        for(int i = n - 1; i > 0; i--) {
            prefixProduct[i] = prefixProduct[i-1] * rightProduct;
            rightProduct = rightProduct * array[i];
        }
        prefixProduct[0] = rightProduct;
        return prefixProduct;
    }
}
