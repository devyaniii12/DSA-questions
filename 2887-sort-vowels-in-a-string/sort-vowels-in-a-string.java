class Solution {
    public String sortVowels(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')       {
                    st.add(ch);
                }
            }
        }
        char[] vowels=new char[st.size()];
        for(int i=0;i<vowels.length;i++){
            vowels[i]=st.pop();
        }
        Arrays.sort(vowels);
        int j=0;
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                t+=vowels[j];
                j++;
            }
            else t+=ch;
        }
        return t;
    }
}