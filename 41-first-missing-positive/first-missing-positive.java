class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int index=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[index]){
                swap(nums,i,index);

            }else{
                i++;
            }
        }

    //search for missing number 
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
       
    }
     return nums.length+1;
    }
    public void swap(int[] nums,int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}