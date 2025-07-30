class Solution {
    public List<String> generateParenthesis(int n) {
        int open=n;
        int close=n;
        List<String> ans=new ArrayList<>();
        helper(open,close,"",ans);
        return ans;
    }
    void helper(int open,int close,String s,List<String> ans){
        if(open==0 && close==0){
            ans.add(s);
            return;
        }
        if(open>0) helper(open-1,close,s+"(",ans);
        if(close>open){
            helper(open,close-1,s+")",ans);
        }
    }
}