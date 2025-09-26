class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))) vowels.add(s.charAt(i));
        }
        int k=vowels.size()-1;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ans+=vowels.get(k);
                k--;
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}