class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String ans="";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(str.length()>0){
                    st.push(str);
                    str="";
                }
            }
            else{
                str+=ch;
            }
        }
        if(str.length()>0){
            st.push(str);
        }
        while(st.size()>0){
            ans+=st.pop();
            if(st.size()>0){
                ans+=" ";
            }
        }
        return ans;
    }
}