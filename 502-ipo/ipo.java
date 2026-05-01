class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        PriorityQueue<int[]> minCap=new PriorityQueue<>(
            (a,b)-> {
                return a[0]-b[0];
            }
        );
        for(int i=0;i<n;i++){
            minCap.add(new int[]{capital[i],profits[i]});
        }

        PriorityQueue<Integer> maxProfit=new PriorityQueue<>(
            (a,b)->{
                return b-a;
            }
        );
        for(int i=0;i<k;i++){
        while(!minCap.isEmpty() && minCap.peek()[0]<=w){
            maxProfit.add(minCap.poll()[1]);
        }
        if(maxProfit.isEmpty()) break;
            w+=maxProfit.poll();
        }
        return w;
    }
}