class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] stor=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            stor[i][0]=nums[i];
            stor[i][1]=i;
        }
        Arrays.sort(stor,(a,b)->a[0]-b[0]);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(stor[left][0]+stor[right][0]==target){
                return new int[]{stor[left][1],stor[right][1]};
            }
            else if(stor[left][0]+stor[right][0]>target){
                right--;
            }
            else left++;
        }
        return new int[]
{-1,-1};    }
}