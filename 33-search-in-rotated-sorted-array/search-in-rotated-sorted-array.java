class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;int end=n-1;
        int minId=min(nums);
        int ans1=-1;
        if(minId>0){
             ans1=bs(nums,target,0,minId-1);
        }
        int ans2=bs(nums,target,minId,end);
        if(ans2<0){
            return ans1;
        }
        else{
            return ans2;
        } 
     
    }
    public int min(int[] nums){
        int n=nums.length;
        int start=0;int end=n-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    int bs(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}