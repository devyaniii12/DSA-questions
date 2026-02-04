class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, candidates, list, ans, 0, target);
        return ans;
    }

    void helper(int start, int[] candidates, List<Integer> list, List<List<Integer>> ans, int sum, int target) {
        if ( sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
           if (sum > target) return;
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            helper(i, candidates, list, ans, sum + candidates[i], target);
            list.remove(list.size() - 1);
           
        }
    }
}