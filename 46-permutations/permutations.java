class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] isVisited=new boolean[nums.length];
        permutations(nums,ds,ans,isVisited);
        return ans;

    }
    public void permutations(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] isVisited){
        int n=nums.length;
        if(ds.size()==n){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
         for(int i=0;i<n;i++){
            
            if(isVisited[i]==false){
                ds.add(nums[i]);
                isVisited[i]=true;
                permutations(nums,ds,ans,isVisited);
                isVisited[i]=false;
                ds.remove(ds.size()-1);
         }
    }
    }
}
