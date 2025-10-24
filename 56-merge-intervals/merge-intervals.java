class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        boolean changed = true;

        while (changed) {
            changed = false;
            List<int[]> next = new ArrayList<>();
            boolean[] used = new boolean[list.size()];

            for (int i = 0; i < list.size(); i++) {
                if (used[i]) continue;
                int start = list.get(i)[0];
                int end = list.get(i)[1];
                for (int j = i + 1; j < list.size(); j++) {
                    if (used[j]) continue;
                    int s = list.get(j)[0], e = list.get(j)[1];
                    // Check overlap
                    if (!(e < start || s > end)) {
                        start = Math.min(start, s);
                        end = Math.max(end, e);
                        used[j] = true;
                        changed = true;
                    }
                }
                next.add(new int[]{start, end});
            }
            list = next;
        }

        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        return ans;

}
}