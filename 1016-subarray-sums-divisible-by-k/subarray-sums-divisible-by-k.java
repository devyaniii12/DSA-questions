class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int redpart=(sum%k);
            if(redpart<0){
                redpart=redpart+k;
            }
            if(map.containsKey(redpart)){
                ans+=map.get(redpart);
            }
            map.put(redpart,map.getOrDefault(redpart,0)+1);
        }
        return ans;
    }
}