class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] count1=new char[26];
        char[] count2=new char[26];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            count1[ch1-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch1=t.charAt(i);
            count2[ch1-'a']++;
        }
        for(int i=0;i<count1.length;i++){
            if(count1[i]!=count2[i]) return false;
        }
        return true;
    }
}