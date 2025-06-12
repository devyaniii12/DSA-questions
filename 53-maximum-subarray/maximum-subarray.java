class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum=0;
        if(nums.length==1) return nums[0];
    for (int i=0; i <nums.length; i++) {
        currentSum =  Math.max(nums[i], currentSum+nums[i]);
        maxSoFar = Math.max(maxSoFar, currentSum);
    }
    return maxSoFar;
    }
}