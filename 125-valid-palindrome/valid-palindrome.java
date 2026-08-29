class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        String lower=s.toLowerCase();
        while(left<right){
            char ch1=lower.charAt(left);
            char ch2=lower.charAt(right);

            if(!Character.isDigit(ch1) && !Character.isLetter(ch1)){
                left++;
                continue;
            }
            else if(!Character.isDigit(ch2) && !Character.isLetter(ch2)){
                right--;
                continue;
            }
            else if(ch1 != ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}