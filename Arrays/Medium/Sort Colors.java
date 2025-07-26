/*class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}*/

class Solution {
    public void sortColors(int[] nums) {
        int i = 0; 
        int j = 0;
        int n1 = 0;
        int a = 0;
        
        while (i < nums.length && n1 < 3) {
            a = 0;
            
            if (j >= nums.length) {
                n1++;
                j = i;
                continue;
            }

            if (nums[j] == n1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
                a = 1;
            }

            if (a != 1) {
                j++;
            }
        }
    }
}

/*
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;                // pointer for 0s (red zone)
        int mid = 0;                // current index
        int high = nums.length - 1; // pointer for 2s (blue zone)

        // Process until mid crosses high
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap 0 to the beginning
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is in the middle zone, just move on
                mid++;
            } else {
                // Swap 2 to the end
                swap(nums, mid, high);
                high--;
                // Don't move mid, since swapped value at mid needs to be checked again
            }
        }
    }

    // Helper function to swap values in array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
*/
