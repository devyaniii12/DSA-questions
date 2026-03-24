class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                provinces++;
            }
        }
        return provinces;
    }
    void dfs(int start,int[][] isConnected, boolean[] visited){
        visited[start]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[start][i]==1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }
    void bfs(int start,int[][] isConnected,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        int n=isConnected.length;
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[node][i]==1 && !visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
}