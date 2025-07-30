class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,nums,list,ans);
        return ans;
        
    }
    public void helper(int index,int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        helper(index+1,nums,list,ans);

        list.remove(list.size()-1);
        helper(index+1,nums,list,ans);
    }
}