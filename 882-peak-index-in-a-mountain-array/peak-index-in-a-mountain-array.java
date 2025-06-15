class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr);
    }
    public int binarySearch(int[]arr){
        int start=0;int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){//decreasing part
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){//ascending part
                start=mid+1;
            }
            
        }
       return start;
    }
}