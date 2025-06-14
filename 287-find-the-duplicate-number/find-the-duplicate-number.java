class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer, Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])>1) return nums[i];
       } 
       return nums[0];
    }
}