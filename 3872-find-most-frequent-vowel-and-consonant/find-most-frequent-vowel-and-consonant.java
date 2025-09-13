class Solution {
    public int maxFreqSum(String s) {
        char[] vowel=new char[5];
        char[] conso=new char[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') vowel[0]++;
            else if(ch=='e') vowel[1]++;
            else if(ch=='i') vowel[2]++;
            else if(ch=='o') vowel[3]++;
            else if(ch=='u') vowel[4]++;
            else conso[ch-'a']++;
        }
        Arrays.sort(vowel);
        int vcount=vowel[4];
        int ccount=0;
        for(int i=0;i<26;i++){
            ccount=Math.max(ccount,conso[i]);
        }
        // if(vcount==0){
        //     return 0;
        // }
        return vcount+ccount;
    }
}