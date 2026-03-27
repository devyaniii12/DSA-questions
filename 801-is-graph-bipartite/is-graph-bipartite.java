class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited=new int[graph.length];
        Arrays.fill(visited,-1);

        for(int i=0;i<graph.length;i++){
            if(visited[i]==-1){
                if(!bfs(i,graph,visited)) return false;
            }
        }
        return true;
    }
    boolean bfs(int node,int[][] graph,int[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        visited[node]=0;

        while(!q.isEmpty()){
            int ele=q.poll();

            for(int nei:graph[ele]){
                if(visited[nei]==-1){
                    visited[nei]=1-visited[ele];
                    q.add(nei);
                }
                else if(visited[nei]==visited[ele]){
                    return false;
                }
            }
        }
        return true;
    }
}