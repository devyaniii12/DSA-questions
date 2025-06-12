class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int maxD=Math.abs(nums[n-1]-nums[0]);
        for(int i=1;i<nums.length;i++){
            int diff=Math.abs(nums[i]-nums[i-1]);
            maxD=Math.max(maxD,diff);
        }
        return maxD;
    }
}