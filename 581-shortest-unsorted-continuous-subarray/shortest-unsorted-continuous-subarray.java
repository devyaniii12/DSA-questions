class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int left=0;
        int right=nums.length-1;
        while(left<nums.length && sorted[left]==nums[left]){
           left++;
        }
        if(left==nums.length) return 0;
        while(right>0 && sorted[right]==nums[right]){
            right--;
        }
        return right-left+1;
    }
}