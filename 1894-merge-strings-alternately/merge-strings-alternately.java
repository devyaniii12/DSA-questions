class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int k=0;int j=0;
        for(int i=0;i<Math.min(word1.length(),word2.length());i++){
            char ch1=word1.charAt(k);
            ans.append(ch1);
            k++;
            char ch2=word2.charAt(j);
            ans.append(ch2);
            j++;
        }
        if(word1.length()>word2.length()){
            for(int i=k;i<word1.length();i++){
                ans.append(word1.charAt(i));
            }
        }
        else{
            for(int i=j;i<word2.length();i++){
                ans.append(word2.charAt(i));
            }
        }
    return ans.toString();
}
}