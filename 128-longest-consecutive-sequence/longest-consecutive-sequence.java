class Solution {
    public int longestConsecutive(int[] nums) {
        //Brute - T.C=O(nlog(n)) S.C=O(1)
        // int n=nums.length;
        // if(n==0) return 0;
        // Arrays.sort(nums);
        // int longest=1;int curr=1;
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]) continue;
        //     else if(nums[i]==nums[i-1]+1) curr++;
        //     else curr=1;
        //     longest=Math.max(longest,curr);
        // }
        // return longest;

        //Optimal - HashSet T.C=O(n)
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                //restart
                int curr=num;
                int streak=1;
                while(set.contains(curr+1)){
                    curr++;
                    streak++;  
                }
                longest=Math.max(longest,streak);
            }
        }
        return longest;   
         }
}