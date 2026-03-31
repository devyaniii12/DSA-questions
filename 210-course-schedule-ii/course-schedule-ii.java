class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int[] ans=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree =new int[n];
        for(int[] arr:pre){
            int u=arr[0];
            int v=arr[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        int idx=0;
        while(!q.isEmpty()){
            int ele=q.poll();
            ans[idx++]=ele;
            for(int i:adj.get(ele)){
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }
        }

        if(idx!=n){
            return new int[0];
        }
        return ans;
    }
}