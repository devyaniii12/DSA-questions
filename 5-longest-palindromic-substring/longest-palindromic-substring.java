class Solution {
    public String longestPalindrome(String s) {
      for(int i=s.length();i>0;i--){
        for(int j=0;j<=s.length()-i;j++){
            if(palindrome(j,j+i-1,s)){
                return s.substring(j,j+i);
            }
        }
      }
      return s;  
    }
    boolean palindrome(int i,int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}