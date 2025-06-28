class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Store value and index
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i]; // value
            pairs[i][1] = i;       // original index
        }

        // Step 2: Sort by value descending
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Step 3: Take top k elements
        List<int[]> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(pairs[i]);
        }

        // Step 4: Sort topK by index to keep original order
        topK.sort(Comparator.comparingInt(a -> a[1]));

        // Step 5: Extract values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        return result;
    }
}