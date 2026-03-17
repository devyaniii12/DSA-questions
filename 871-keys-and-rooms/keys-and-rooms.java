class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        bfs(0,rooms,visited);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
    void bfs(int start,List<List<Integer>> rooms,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int val=q.poll();
            for(int v:rooms.get(val)){
                if(!visited[v]){
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
    }
}