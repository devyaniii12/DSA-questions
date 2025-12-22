class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int low=0;
        int res=0;
        int maxFreq=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            freq[ch-'A']++;
            int window=high-low+1;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            int diff=window-maxFreq;
            while(diff>k){
                freq[s.charAt(low)-'A']--;
                low++;
                window=high-low+1;
                diff=window-maxFreq;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}