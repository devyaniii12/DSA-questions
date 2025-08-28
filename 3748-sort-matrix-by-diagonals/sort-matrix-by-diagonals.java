class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                mp.putIfAbsent(key,new ArrayList<>());
                mp.get(key).add(grid[i][j]);
            }
        }
        
        for(int key:mp.keySet()){
            List<Integer> diag=mp.get(key);
            if(key>=0){
                diag.sort(Collections.reverseOrder());
            }
            else{
                Collections.sort(diag);
            }
        }

        Map<Integer,Integer> idxMap=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                int idx=idxMap.getOrDefault(key,0);
                grid[i][j]=mp.get(key).get(idx);
                idxMap.put(key,idx+1);
            }
        }
        return grid;
    }
}