class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = getMaxPile(piles); 
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (canFinish(piles, mid, h)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }

        return result;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private boolean canFinish(int[] piles, int k, int h) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k; 
            if (totalHours > h) { 
                return false;
            }
        }
        return totalHours <= h;
    }
}
