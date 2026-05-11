class Solution {
    public int totalFruit(int[] fruits) {
       int n=fruits.length; 
       int low=0;
       int ans=-1;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int high=0;high<n;high++){
        mp.put(fruits[high],mp.getOrDefault(fruits[high],0)+1);

        while(mp.size()>2){
            mp.put(fruits[low],mp.get(fruits[low])-1);
            if(mp.get(fruits[low])==0) mp.remove(fruits[low]);
            low++;
        }
        ans=Math.max(ans,high-low+1);
       }
       return ans;
    }
}