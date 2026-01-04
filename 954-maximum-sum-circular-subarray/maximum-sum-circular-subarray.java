class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxEnd=nums[0];int maxSum=nums[0];
       int minEnd=nums[0];int minSum=nums[0];
       int totalSum=nums[0];

       for(int i=1;i<nums.length;i++){
        maxEnd=Math.max(nums[i],maxEnd+nums[i]);
        maxSum=Math.max(maxSum,maxEnd);
        minEnd=Math.min(nums[i],minEnd+nums[i]);
        minSum=Math.min(minSum,minEnd);
        totalSum+=nums[i];
       }
       if(maxSum<0) return maxSum;
       return Math.max(maxSum,totalSum-minSum);
    }
}