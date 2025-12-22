class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m < n) return "";

        int[] freqS = new int[256];
        int[] freqT = new int[256];

        for (int i = 0; i < n; i++) {
            freqT[t.charAt(i)]++;
        }

        int low = 0;
        int start = -1;
        int res = Integer.MAX_VALUE;

        for (int high = 0; high < m; high++) {
            freqS[s.charAt(high)]++;

            while (sahi(freqS, freqT)) {
                if (high - low + 1 < res) {
                    res = high - low + 1;
                    start = low;
                }

                // shrink window
                freqS[s.charAt(low)]--;
                low++;
            }
        }

        return start == -1 ? "" : s.substring(start, start + res);
    }

    boolean sahi(int[] freqS, int[] freqT) {
        for (int i = 0; i < 256; i++) {
            if (freqS[i] < freqT[i]) return false;
        }
        return true;
    }
}
