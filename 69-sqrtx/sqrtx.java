class Solution {
    public int mySqrt(int x) {
        int start=0;int end=x;int result=0;
        if(x==0 || x==1){
            return x;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            //mid^2<=x
            if(mid>0 && mid<=x/mid){
                result=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    
}