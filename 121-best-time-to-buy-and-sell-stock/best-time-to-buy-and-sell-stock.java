class Solution {
    public int maxProfit(int[] prices) {

    //Brute- all possible pairs
    // int n = prices.length;
    //     int maxProfit = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
    //         }
    //     }
    // return maxProfit;



    //Better- Precompute Min on Left
    // int n = prices.length;
    //     int[] minSoFar = new int[n];
    //     minSoFar[0] = prices[0];

    //     for (int i = 1; i < n; i++) {
    //         minSoFar[i] = Math.min(minSoFar[i - 1], prices[i]);
    //     }

    //     int maxProfit = 0;
    //     for (int i = 1; i < n; i++) {
    //         maxProfit = Math.max(maxProfit, prices[i] - minSoFar[i]);
    //     }
    //     return maxProfit;





    //Optimal- Single Pass with Tracking Min T.C= O(n), Space: O(1)
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
