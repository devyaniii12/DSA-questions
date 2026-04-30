class Pair{
    int distance;
    int row;
    int col;

    Pair(int distance,int row,int col){
        this.distance=distance;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                return b.distance-a.distance;
            }
        );
        int[] dist=new int[points.length];
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            dist[i]=x*x+y*y;
        }

        for(int i=0;i<k;i++){
            pq.add(new Pair(dist[i],points[i][0],points[i][1]));
        }
        for(int i=k;i<points.length;i++){
            if(pq.peek().distance>dist[i]){
                pq.poll();
                pq.add(new Pair(dist[i],points[i][0],points[i][1]));
            }
        }

        for(int i=0;i<k;i++){
            Pair p=pq.peek();
            ans[i][0]=p.row;
            ans[i][1]=p.col;
            pq.poll();
        }
        return ans;
    }
}