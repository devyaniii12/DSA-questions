class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;int ans=0;
        Set<Character> set=new HashSet<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            while(set.contains(ch)){
                set.remove(s.charAt(low));
                low++;
            }
             set.add(ch);
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}