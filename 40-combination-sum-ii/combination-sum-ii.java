class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,candidates,0,target,list,ans);
        return ans;
    }
    void helper(int start,int[] candidates,int sum,int target,List<Integer> list,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            helper(i+1,candidates,sum+candidates[i],target,list,ans);
            list.remove(list.size()-1);
        }
    }
}