class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int required = target + prefix[i];
            int bound = Arrays.binarySearch(prefix, required);
            if (bound < 0) bound = -bound - 1; // find insertion point
            if (bound <= n) {
                minLen = Math.min(minLen, bound - i);
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}