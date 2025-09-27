class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;
        while(left<=right){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq){
                ans[pos]=leftSq;
                pos--;
                left++;
            }
            else{
                ans[pos]=rightSq;
                pos--;
                right--;
            }
        }
        return ans;
    }
}