class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int k=n-1;
       while(left<=right){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(left<right && leftSq>rightSq){
                ans[k--]=leftSq;
                left++;
            }
            else{
                ans[k--]=rightSq;
                right--;
            }
       }
       return ans; 
    }
}