class Solution {
    Random randomNo = new Random();
    public int findKthLargest(int[] nums, int k) {
        //Brute-with sorting
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // Step 1: Find min and max in array
        for (int n : nums) {
            low = Math.min(low, n);
            high = Math.max(high, n);
        }

        // Step 2: Binary search on value range
        while (low <= high) {
            int mid = (low + high) / 2;
            int count = 0;

            // Count elements >= mid
            for (int n : nums) {
                if (n >= mid) {
                    count++;
                }
            }

            // Adjust search space
            if (count >= k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        // Step 3: 'high' is the kth largest
        return high;
    }
    }