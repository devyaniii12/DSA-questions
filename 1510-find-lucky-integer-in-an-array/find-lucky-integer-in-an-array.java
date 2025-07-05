class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int k:mp.keySet()){
            if(k==mp.get(k)){
                lucky=Math.max(lucky,k);
            }
        }
        return lucky;
    }
}