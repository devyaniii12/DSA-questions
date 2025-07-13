class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)
            +1);
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            if(!mp.containsKey(ch) || mp.get(ch)==0) return false;
            mp.put(ch,mp.get(ch)-1);
        }
        return true;

    }
}