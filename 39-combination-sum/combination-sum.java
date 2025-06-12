class Solution {
    void combSum(int ind,int[] arr,int target,List<Integer> list,List<List<Integer>> ans){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            combSum(ind,arr,target-arr[ind],list,ans);
            list.remove(list.size()-1);
        }
        combSum(ind+1,arr,target,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        combSum(0,candidates,target,new ArrayList<>(),ans);
        return ans; 
           }
}