class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int c=nums.length-1;c>=2;c--){
            int a=0;int b=c-1;
            while(a<b){
                if(nums[a]+nums[b]>nums[c]){
                    ans+=b-a;
                    b--;
                }
                else a++;
            }
        }
        return ans;
    }
}