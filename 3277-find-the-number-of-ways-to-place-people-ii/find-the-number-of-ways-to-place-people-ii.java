class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.parallelSort(points, (p, q) -> {
            return p[0]==q[0]?(p[1]-q[1]):(q[0]-p[0]);
        });
        final int n=points.length;
        int ans=0;
        for(int i=0; i<n-1; i++){
            int y=Integer.MAX_VALUE, yi=points[i][1];
            for(int j = i+1; j<n; j++){
                final int yj=points[j][1];
                if (yj>=yi && y>yj){//P[j] cannot be in between
                    ans++;
                    y=yj;
                    if (yi==yj) break;
                }
            }
        }
        return ans;
    }
}