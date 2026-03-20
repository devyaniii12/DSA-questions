class Pair{
    int row,col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int time=0;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }

        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;

            //top row-1,col
            if(row>0){
                if(grid[row-1][col]==1){
                    grid[row-1][col]=2;
                    q.add(new Pair(row-1,col,p.time+1));
                    time=Math.max(time,p.time+1);
                }
            }

            //bottom row+1,col

            if(row<m-1){
                if(grid[row+1][col]==1){
                    grid[row+1][col]=2;
                    q.add(new Pair(row+1,col,p.time+1));
                    time=Math.max(time,p.time+1);
                }
            }

            //left row,col-1
            if(col>0){
                if(grid[row][col-1]==1){
                    grid[row][col-1]=2;
                    q.add(new Pair(row,col-1,p.time+1));
                    time=Math.max(time,p.time+1);
                }
            }

            //right row,col+1
            if(col<n-1){
                if(grid[row][col+1]==1){
                    grid[row][col+1]=2;
                    q.add(new Pair(row,col+1,p.time+1));
                    time=Math.max(time,p.time+1);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}