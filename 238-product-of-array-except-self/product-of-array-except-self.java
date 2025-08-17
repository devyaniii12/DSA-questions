class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute
        // int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int mul=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             mul=mul*nums[j];
        //         }
        //     }
        //     ans[i]=mul;
        // }
        // return ans;




        //better- using prefix and suffix arrays
        // int n=nums.length;
        // int[] left=new int[n];
        // int[] right=new int[n];
        // int[] ans=new int[n];
        // left[0]=1;
        // for(int i=1;i<n;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }

        // right[n-1]=1;
        // for(int i=n-2;i>=0;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }

        // for(int i=0;i<n;i++){
        //     ans[i]=left[i]*right[i];
        // }
        // return ans;





        //optimal- using ans array to store left array multiples 
        int n=nums.length;
        int suffix=1;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
    }
}