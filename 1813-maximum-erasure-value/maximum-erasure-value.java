class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int start=0;int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                sum-=nums[start];
                start++;
            }
             set.add(nums[end]);
                sum+=nums[end]; 
                 maxSum=Math.max(maxSum,sum);  
            }
        return maxSum;
    }
}