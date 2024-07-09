package Arrays4;

import java.util.Arrays;

/*
 * Given arr[n], find out fist missing natural number(1, 2, 3,...)
 * */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findFirstMissingPositive1(arr));  // Output: 2
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(i < n) {
            if(nums[i] < 1 || nums[i] > n || i == nums[i] - 1) {
                i++;
            }
            else{
                int idx = nums[i] - 1;
                if(nums[idx] == nums[i]){
                    i++;
                }
                else
                    swap(nums, idx, i);
            }
        }
        for(int idx = 0; idx < n; idx++) {
            if(nums[idx] != idx + 1) return idx+1;
        }
        return n+1;
    }

    public static void swap(int[] nums, int idx, int i) {
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }

    public static int findFirstMissingPositive1(int[] arr) {

        Arrays.sort(arr);

        int missing = 1;

        for (int num : arr) {
            if (num == missing) {
                missing++;
            }
        }

        return missing;
    }
}