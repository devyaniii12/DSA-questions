class Solution {
    public String longestPalindrome(String s) {
        String longMax="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                if(isPalindrome(a) && (a.length()>longMax.length())){
                    longMax=a;
                }
            }
        }
        return longMax;
    }
    boolean isPalindrome(String a){
        int left=0;int right=a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}