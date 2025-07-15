class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=search(nums,target,true);
        arr[1]=search(nums,target,false);
        return arr;
    }
    int search(int[] nums,int target,boolean flag){
        int start=0;int end=nums.length-1;int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }  
            else{
                ans=mid;//potential ans
                if(flag){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }      
            }
            return ans;
        }
    }