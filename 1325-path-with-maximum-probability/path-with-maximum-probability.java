class Pair{
    int node;
    double succ;
    Pair(int node,double succ){
        this.node=node;
        this.succ=succ;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<edges.length;i++){
            int node=edges[i][0];
            int neigh=edges[i][1];
            double success=succProb[i];

            adj.get(node).add(new Pair(neigh,success));
            adj.get(neigh).add(new Pair(node,success));
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.succ,a.succ));
        double[] prob=new double[n];
        prob[start_node]=1.0;
        pq.add(new Pair(start_node,prob[start_node]));

        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int cnode=p.node;
            double cprob=p.succ;
            if(end_node==cnode) return cprob;

            for(Pair pr:adj.get(cnode)){
                double newProb=cprob*pr.succ;
                if(newProb>prob[pr.node]){
                    prob[pr.node]=newProb;
                    pq.add(new Pair(pr.node,newProb));
                }
            }
        }
        return 0.0;
    }
}