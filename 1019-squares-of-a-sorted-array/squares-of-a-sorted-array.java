class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int left=0, right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq){
                ans[i]=leftSq;
                left++;
            }
            else{
                ans[i]=rightSq;
                right--;
            }
        }
        return ans;
    }
}