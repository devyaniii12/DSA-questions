class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        helper(0,s,list,ans);
        return ans;
    }
    void helper(int start,String s,List<String> list,List<List<String>> ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(start,end,s)){
                list.add(s.substring(start,end+1));
                helper(end+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    boolean isPalindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}