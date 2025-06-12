class Solution {
    void  combSum(int ind,int[] arr,List<Integer> list,List<List<Integer>> ans,int target,int sum){
          
            if(sum==target){
                ans.add(new ArrayList<>(list));
                return;
            }
            for(int i=ind; i<arr.length;i++){
                if(i>ind && arr[i]==arr[i-1]){
                    continue;
                }
                if(sum+arr[i]>target){
                    break;
                }
                
            list.add(arr[i]);
           
            combSum(i+1,arr,list,ans,target,sum+arr[i]);
            list.remove(list.size()-1);
         
        
            }

            
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combSum(0,candidates,new ArrayList<> (),ans,target,0);
        return ans;
    }
}