class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int low=0;
        Set<Character> set=new HashSet<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            while(set.contains(ch)){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(ch);
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}