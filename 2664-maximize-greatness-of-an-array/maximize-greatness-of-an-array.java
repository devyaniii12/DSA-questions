class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int a : nums)
            if (a > nums[res])
                res++;
        return res;
    }
}