class Solution {
    public int search(int[] nums, int target) {
        int peak=pivot(nums);
        int ans=binarySearch(nums,target,0,peak);
        if (ans==-1){
            ans=binarySearch(nums,target,peak+1,nums.length-1);
        }
        return ans;
    }
    int pivot(int[] nums){
        int start=0;int end=nums.length-1;
        if(nums[start]<nums[end]) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            else if(mid>start && nums[mid]<nums[mid-1]) return mid-1;

            else if(nums[mid]>=nums[start]) start=mid+1;
            else end=mid-1;
            
        }
        return -1;
    }
    int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
             int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}