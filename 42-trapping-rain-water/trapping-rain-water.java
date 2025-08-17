class Solution {
    public int trap(int[] height) {
        //brute- calculate leftMax and rightMax for each element using loops
        // int n = height.length;
        // int water = 0;

        // for (int i = 0; i < n; i++) {
        //     int leftMax = 0, rightMax = 0;

        //     // find left max
        //     for (int j = 0; j <= i; j++) {
        //         leftMax = Math.max(leftMax, height[j]);
        //     }

        //     // find right max
        //     for (int j = i; j < n; j++) {
        //         rightMax = Math.max(rightMax, height[j]);
        //     }

        //     water += Math.min(leftMax, rightMax) - height[i];
        // }
        // return water;


        //better-using leftarray and right array/ prefix array concept
        // int n=height.length;
        // int[] leftMax=new int[n];
        // int[] rightMax=new int[n];
        // int[] water=new int[n];
        // leftMax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     leftMax[i]=Math.max(leftMax[i-1],height[i]);
        // }
        // rightMax[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     rightMax[i]=Math.max(rightMax[i+1],height[i]);
        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     water[i]=Math.min(leftMax[i],rightMax[i])-height[i];
        //     sum+=water[i];
        // }
        // return sum;

        //Optimal- Two pointers
        int n=height.length;
        int left=0;int right=n-1;
        int leftMax=0;int rightMax=0;
        int sum=0;
        while(left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);
            if(leftMax<rightMax){
                sum+=Math.min(leftMax,rightMax)-height[left];
                left++;
            }
            else{
                sum+=Math.min(leftMax,rightMax)-height[right];
                right--;
            }
        }
        return sum;
    }
}