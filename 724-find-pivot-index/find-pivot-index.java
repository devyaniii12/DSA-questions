class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int prefix=0;
        int suffix=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum-nums[0]==0) return 0;
        for(int i=1;i<n;i++){
            prefix+=nums[i-1];
            suffix=sum-prefix-nums[i];
            if(prefix==suffix) return i;
        }
        return -1;
    }
}