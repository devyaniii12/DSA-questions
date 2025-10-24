class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int prev=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[prev][1]>=intervals[i][0]){
                intervals[prev][1]=Math.max(intervals[prev][1],intervals[i][1]);
            }
            else{
                prev++;
                intervals[prev]=intervals[i];
            }
        }
        return Arrays.copyOfRange(intervals,0,prev+1);
    }
}