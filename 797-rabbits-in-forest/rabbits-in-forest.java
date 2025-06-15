class Solution {
    public int numRabbits(int[] answers) {
       Map<Integer,Integer> map=new HashMap<>();
        for(int ans:answers){
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        int total=0;
        for(int x:map.keySet()){
            int count=map.get(x);
            int groupSize=x+1;
            int groups=(count+groupSize-1)/groupSize; 
            total+=groups*groupSize;
        }
        return total; 
    }
}