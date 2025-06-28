class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i]; // value
            pairs[i][1] = i;       // original index
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        List<int[]> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(pairs[i]);
        }
        topK.sort(Comparator.comparingInt(a -> a[1]));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        return result;
    }
}