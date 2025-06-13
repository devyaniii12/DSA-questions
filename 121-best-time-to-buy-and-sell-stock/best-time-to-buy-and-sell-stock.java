class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int currmin=prices[i];
            if(min>currmin) min=currmin;
            maxP=Math.max(maxP,prices[i]-min);
        }
        return maxP;
    }
}