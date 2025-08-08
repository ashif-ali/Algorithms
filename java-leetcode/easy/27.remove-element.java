/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int position = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
// @lc code=end
