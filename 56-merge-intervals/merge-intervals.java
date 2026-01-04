class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int newS=intervals[i][0];
            int newE=intervals[i][1];
            if(end>=newS){
                end=Math.max(end,newE);
            }
            else {
                ans.add(new int[]{start,end});
                start=newS;
                end=newE;
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}