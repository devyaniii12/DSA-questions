class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(0,0,n,"",ans);
        return ans;
    }
    void helper(int open,int close,int n,String str, List<String> ans){
        if(str.length()== 2*n){
            ans.add(str);
            return;
        }
        if(open<n){
            helper(open+1,close,n,str+"(",ans);
        }
        if(close<open){
            helper(open,close+1,n,str+")",ans);
        }
    }
}