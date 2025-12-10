class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int high=0;
        int low=0;
        int sum=nums[low];
        
        while(high<nums.length){
            if(sum<target){
                if(high==nums.length-1) break;
                 high++;  
                sum+=nums[high];
            }  
            while(sum>=target){
                res=Math.min(res,high-low+1);
                low++;
                sum-=nums[low-1];
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}