class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int storex=x;
        if(x<0){
            return false;
        }
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;
            
        }
        if(rev==storex){
                return true;
            }
        else{
            return false;
        }
        
    }
}