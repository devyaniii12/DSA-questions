class Solution {
    public int maxProduct(int[] nums) {
        //Brute- T.C=O(N*N) S.C=O(1)
        // int maxP=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int p=1;
        //     for(int j=i;j<nums.length;j++){
        //         p*=nums[j];
        //         maxP=Math.max(maxP,p);
        //     }
        // }
        // return maxP;

            //Optimal
            int n=nums.length;
            int maxP=Integer.MIN_VALUE;
            int prefix=1;int suffix=1;
            for(int i=0;i<nums.length;i++){
                if(prefix==0){
                    prefix=1;
                }
                if(suffix==0) suffix=1;
                prefix=prefix*nums[i];
                suffix=suffix*nums[n-i-1];
                maxP=Math.max(maxP,Math.max(prefix,suffix));
            }
            return maxP;

    }
}