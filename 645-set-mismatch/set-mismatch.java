import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            // Swap nums[i] with nums[index] only if they are not already in the correct place
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }

        int[] result = new int[2];
        // Search for the duplicate and missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result[0] = nums[j];    // Duplicate number
                result[1] = j + 1;      // Missing number
            }
        }
        return result;
    }

    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }}