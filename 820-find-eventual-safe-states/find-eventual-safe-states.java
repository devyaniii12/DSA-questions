class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int ele:graph[i]){
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int num=q.poll();
            ans.add(num);
            for(int i : adj.get(num)){
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}