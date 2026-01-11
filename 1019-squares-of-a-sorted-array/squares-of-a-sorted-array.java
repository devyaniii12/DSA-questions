class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=0;
        int right=nums.length-1;
        for(int i=n-1;i>=0;i--){
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