import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        // Step 2: Swap with just larger element
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        // Step 3: Reverse the rest
        reverse(nums, i + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
    }

    void reverse(int[] nums, int left, int right) {
        while (left < right) swap(nums, left++, right--);
    }
}
