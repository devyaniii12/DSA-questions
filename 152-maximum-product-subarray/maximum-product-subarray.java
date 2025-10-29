class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p=p*nums[j];
                maxP=Math.max(maxP,p);
            }
        }
        return maxP;
    }
}