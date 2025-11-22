class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]*nums[i]);
            }
            else{
                pos.add(nums[i]*nums[i]);
            }
        }
        Collections.reverse(neg);
        int[] ans=new int[nums.length];
        int m=pos.size();
        int n=neg.size();
        int j=0,k=0,l=0;
        while(j<m && k<n){
            if(pos.get(j)<neg.get(k)){
                ans[l++]=pos.get(j++);
            }
            else{
                ans[l++]=neg.get(k++);
            }
        }
        while(j<m){
            ans[l++]=pos.get(j++);
        }
        while(k<n){
            ans[l++]=neg.get(k++);
        }
        return ans;
    }
}