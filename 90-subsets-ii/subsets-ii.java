class Solution {
    void subset (int ind,int[] nums,List<Integer>list,List<List<Integer>> ans){
        
            ans.add(new ArrayList<>(list));
            
        
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subset(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}