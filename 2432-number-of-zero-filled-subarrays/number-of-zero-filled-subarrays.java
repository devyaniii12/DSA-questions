class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zero=0;
        int streak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                streak++;
                zero+=streak;
            }
            else{
                streak=0;
            } 
        }
        return zero;
    }
}