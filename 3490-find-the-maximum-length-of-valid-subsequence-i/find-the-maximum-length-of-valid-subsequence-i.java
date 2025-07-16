class Solution {
    public int maximumLength(int[] nums) {
         int oddCount = 0;          
        int evenCount = 0;        
        int alternatingCount = 0;   
        boolean expectOdd = (nums[0] % 2 == 1); 
        for (int num : nums) {
            if ((num % 2 == 1) == expectOdd) {
                alternatingCount++;      
                expectOdd = !expectOdd;   
            }
            if (num % 2 == 1) {
                oddCount++;            
            } else {
                evenCount++;      
            }
        }
        return Math.max(alternatingCount, Math.max(oddCount, evenCount)); 
    }
}