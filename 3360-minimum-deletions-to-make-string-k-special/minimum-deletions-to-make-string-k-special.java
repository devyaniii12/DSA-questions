class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        int[] updated = new int[26];
        int size = 0;
        for (int f : freq) {
            if (f > 0) updated[size++] = f;
        }
        Arrays.sort(updated, 0, size);

        int min = Integer.MAX_VALUE;          // best answer so far
        int totalSum = word.length();         // sum of all frequencies
        int deletedLeftSum = 0;               // sum of freqs fully deleted on left
        int sumInWindow = 0;                  // sum of freqs inside [i..j)
        int j = 0;                            // right pointer for window
        for (int i = 0; i < size; i++) {
            int from = updated[i];
            int to = from + k;
            while (j < size && updated[j] <= to) {
                sumInWindow += updated[j++];
            }
            int countRight = size - j;
            int sumRight = totalSum - sumInWindow;
            int deletionsRight = sumRight - countRight * to;
            int totalDel = deletedLeftSum + deletionsRight;
            min = Math.min(min, totalDel);
            totalSum -= updated[i];
            deletedLeftSum += updated[i];
            sumInWindow -= updated[i];
        }

        return min;
    }
}