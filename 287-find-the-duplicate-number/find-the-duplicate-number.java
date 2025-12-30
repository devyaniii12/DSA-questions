class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num)) return num;
            else set.add(num);
        }
        return -1;
    }
}