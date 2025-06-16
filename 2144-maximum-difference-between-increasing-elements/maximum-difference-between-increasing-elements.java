class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int diff=0;
            for(int j=i+1;j<nums.length;j++){
                diff=nums[j]-nums[i];
                maxDiff=Math.max(maxDiff,diff);
            }
        }
        if(maxDiff<=0) return -1;
        return maxDiff;
    }
}