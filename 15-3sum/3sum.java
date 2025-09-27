class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(s.contains(third)){
                    int[] triplet=new int[]{nums[i],nums[j],third};
                    Arrays.sort(triplet);
                    set.add(Arrays.asList(triplet[0],triplet[1],triplet[2]));
                }
                s.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}