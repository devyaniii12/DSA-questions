class Solution {
    public int maxProfit(int[] prices) {
        
        
        int maxProfit = 0;
        if (prices == null || prices.length < 2) {
            maxProfit=0; // No profit can be made if there's 0 or 1 day
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
}
