package Arrays2;

public class SubarraySum {

    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 4};

        // Call the method and print the result
        printSubarraySums(array);
    }

    private static void printSubarraySums(int[] array) {

        int[] prefixSum = calcPrefixSum(array);

        int n = array.length;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                if(s == 0) {
                    System.out.println(prefixSum[e]);
                }else {
                    System.out.println(prefixSum[e] - prefixSum[s-1]);
                }
            }
            System.out.println();
        }
    }

    private static int[] calcPrefixSum(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        result[0] = array[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
