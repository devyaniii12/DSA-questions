class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(1,n,k,list,ans);
        return ans;
    }
    void helper(int start,int n,int k,List<Integer> list,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(start>n) return;


        list.add(start);
        helper(start+1,n,k-1,list,ans);
        list.remove(list.size()-1);
        helper(start+1,n,k,list,ans);
    }
}