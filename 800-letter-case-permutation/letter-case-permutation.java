class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        helper(s,"",ans);
        return ans;
    }
    void helper(String Inputt,String Outputt,List<String> ans){
        if(Inputt.length()==0){
            ans.add(Outputt);
            return;
        }
        char ch=Inputt.charAt(0);
        if(Character.isDigit(ch)){
            Outputt=Outputt+ch;
            helper(Inputt.substring(1),Outputt,ans);
        }else{
            char lo=Character.toLowerCase(ch);
            helper(Inputt.substring(1),Outputt+lo,ans);
            char up=Character.toUpperCase(ch);
            helper(Inputt.substring(1),Outputt+up,ans);
        }
    }
}