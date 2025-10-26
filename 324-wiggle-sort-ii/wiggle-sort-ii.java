class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int[] sortedArray=nums.clone();
        int mid=(n+1)/2;
        int j=mid-1;
        int k=n-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=sortedArray[j--];
            }
            else nums[i]=sortedArray[k--];
        }
    }
}