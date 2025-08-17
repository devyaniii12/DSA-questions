class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE- T.C=O(N*N)
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{}; // not needed, since exactly one solution exists



        //BETTER- 2 PASS HASHING T.C=O(N) , S.C=O(N)
        // Map<Integer, Integer> map = new HashMap<>();

        // // First pass: put all elements into map
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }

        // // Second pass: check complement
        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];
        //     if (map.containsKey(complement) && map.get(complement) != i) {
        //         return new int[]{i, map.get(complement)};
        //     }
        // }

        // return new int[]{};
   
        

        //OPTIMAL- 1 PASS HASHING T.C=O(N) , S.C=O(N)
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(mp.containsKey(comp)){
                return new int[]{mp.get(comp),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}