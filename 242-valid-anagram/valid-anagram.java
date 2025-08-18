class Solution {
    public boolean isAnagram(String s, String t) {

        //brute- T.C=O(nlog(n)) S.C=O(1) SOrting and compare

        // if(s.length()!=t.length()) return false;
        // char a[]=s.toCharArray();
        // char[] b=t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);


        //Better- HashMap
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch) || mp.get(ch)==0) return false;
            mp.put(ch,mp.getOrDefault(ch,0)-1);
        }
        return true;
    }
}