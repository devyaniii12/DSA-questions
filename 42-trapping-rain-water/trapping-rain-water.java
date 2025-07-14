class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] mxl=new int[n];
        int[] mxr=new int[n];
        int[] water=new int[n];
        mxl[0]=height[0];
        mxr[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            mxl[i]=Math.max(mxl[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            mxr[i]=Math.max(mxr[i+1],height[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            water[i]=Math.min(mxl[i],mxr[i])-height[i];
            sum+=water[i];
        }
        return sum;

    }
}