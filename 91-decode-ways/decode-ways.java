class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 || s.charAt(0)=='0') return 0;
        
        int n=s.length();
        int prev2=1,prev1=1;
        for(int i=1;i<n;i++){
            int curr=0;
            int oneDigit=s.charAt(i)-'0';
            int twoDigit=Integer.parseInt(s.substring(i-1,i+1));
            if(oneDigit>=1){
                curr+=prev1;
            }
            if(twoDigit>=10 && twoDigit<=26){
                curr+=prev2;
            }
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}