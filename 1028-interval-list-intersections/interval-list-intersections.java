class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end   = Math.min(firstList[i][1], secondList[j][1]);

            // Check if intersection exists
            if (start <= end) {
                ans.add(new int[]{start, end});
            }

            // Move the pointer which ends first
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return ans.toArray(new int[ans.size()][]); 
    }
}