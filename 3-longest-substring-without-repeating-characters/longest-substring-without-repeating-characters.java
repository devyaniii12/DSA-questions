class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int res=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int k=high-low+1;
            while(map.size()<k){
                char leftCh=s.charAt(low);
                map.put(leftCh,map.get(leftCh)-1);
                if(map.get(leftCh)==0){
                    map.remove(leftCh);
                }
                low++;
                k=high-low+1;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}