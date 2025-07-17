/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int start=0;
        int end=n-1;
        int PivotEle=pivot(mountainArr);
        int e1=bs(mountainArr,target,0,PivotEle-1,true);
        int e2=bs(mountainArr,target,PivotEle,n-1,false);
        if(e1!=-1){
            return e1;
        }
        else{
            return e2;
        }      

    }
    public  int pivot(MountainArray arr) {
        int start=0;
        int end=arr.length()-1;
        while (start < end) {
            int mid=start+(end - start)/2;
            if(arr.get(mid)<arr.get(mid+1)){
                start=mid+1; 
            } else {
                end=mid; 
            }
        }
        return start; 
    }
    int bs( MountainArray mountainArr,int target,int start,int end,boolean isAsc){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAsc){
                if(mountainArr.get(mid)>target){
                end=mid-1;
                }
                else if(mountainArr.get(mid)<target){
                start=mid+1;
                }
                else{
                return mid;
                }
            }
            else{
                if(mountainArr.get(mid)>target){
                start=mid+1;
                }
                else if(mountainArr.get(mid)<target){
                end=mid-1;
                }
                else{
                return mid;
                }
            }
            
    }
    return -1;
}
}