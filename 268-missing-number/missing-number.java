class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag++;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return nums.length;

}}

