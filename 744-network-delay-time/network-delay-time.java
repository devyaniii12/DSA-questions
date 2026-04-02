class Pair{
    int node,time;
    Pair(int node,int time){
        this.node=node;
        this.time=time;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {
       List<List<Pair>> adj=new ArrayList<>();
       for(int i=0;i<=n;i++){
        adj.add(new ArrayList<Pair>());
       } 
       for(int i=0;i<times.length;i++){
        int node=times[i][0];
        int neigh=times[i][1];
        int time=times[i][2];
        adj.get(node).add(new Pair(neigh,time));
       }
       
       int[] ans=new int[n+1];
       Arrays.fill(ans,Integer.MAX_VALUE);
       ans[src]=0;
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.time-b.time);
       pq.add(new Pair(src,0));

       while(pq.size()>0){
        Pair p=pq.remove();
        int node=p.node;
        if(p.time>ans[node]) continue;
        
        for(Pair pr:adj.get(node)){
            int totalTime=p.time+pr.time;

            if(totalTime<ans[pr.node]){
                ans[pr.node]=totalTime;
                pq.add(new Pair(pr.node,totalTime));
            }
        }
       }
       int max=-1;
       for(int i=1;i<=n;i++){
        if(ans[i]==Integer.MAX_VALUE) return -1;
        if(ans[i]>max) max=ans[i];
       }
       return max;
    }
}