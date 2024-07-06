package Arrays;

public class RainWaterTrapping {

    public static void main(String[] args) {
        // Example input array representing heights
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Call the method and get the result
        int trappedWater = trapRainwater(height);

        // Print the result
        System.out.println("Trapped rainwater: " + trappedWater);
    }

    private static int trapRainwater(int[] height) {
        // Logic for calculating trapped rainwater will go here
        int amount = 0;
        int level = 0;
        int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }
        suffixMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            int leftBlock = prefixMax[i - 1];
            int rightBlock = suffixMax[i + 1];
            level = Math.min(leftBlock, rightBlock);
            if (height[i] < level) {
                amount += level - height[i];
            }
        }
        return amount; // Placeholder return statement


    }
}
