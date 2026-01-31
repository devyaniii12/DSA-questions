class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, nums, list, ans);
        return ans;
    }

    void helper(int start, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        for (int idx = start; idx < nums.length; idx++) {
            if(idx>start && nums[idx]==nums[idx-1]) continue;
            // helper(idx + 1, nums, list, ans);
            list.add(nums[idx]);
            helper(idx + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }
    }
}