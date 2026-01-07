class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            else if(st.peek()==ch){
                st.pop();
                continue;
            }
            st.push(ch);
        }
        String revAns="";
        while(!st.isEmpty()){
            revAns+=st.pop();
        }
        String ans="";
        for(int i=revAns.length()-1;i>=0;i--)
{
    ans+=revAns.charAt(i);
}        return ans;
    }
}