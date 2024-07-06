package Arrays2;

/*
 * Given n array elements, return sum of all sub-array sums
 * */

public class SubarraySum2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        printSubarraySums2(array);
    }

    private static void printSubarraySums2(int[] array) {

        int[] prefixSum = calcPrefixSum(array);
        int ans = 0;
        int n = array.length;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                if (s == 0) {
                    ans += prefixSum[e];
                } else {
                    ans += prefixSum[e] - prefixSum[s - 1];
                }
            }
            System.out.println(ans);
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