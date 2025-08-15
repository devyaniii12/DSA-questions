class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minp;
            maxp=Math.max(maxp,profit);
            if(minp>prices[i]) minp=prices[i];
            }
            
            return maxp; 
        }
    }
