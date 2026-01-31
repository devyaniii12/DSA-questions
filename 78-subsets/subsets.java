class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int i=0;
        helper(i,nums,list,ans);
        return ans;
    }
    void helper(int i,int[] nums,List<Integer> list, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        helper(i+1,nums,list,ans);
        list.add(nums[i]);
        helper(i+1,nums,list,ans);
        list.remove(list.size()-1);
    }

}