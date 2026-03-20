class Pair{
        int row,col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    bfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    void bfs(int i,int j,char[][] grid, boolean[][] visited){
        int m=grid.length;
        int n=grid[0].length;

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;

            //top= row-1,col
            if(row>0){
                if(grid[row-1][col]=='1' && visited[row-1][col]==false){
                    q.add(new Pair(row-1,col));
                    visited[row-1][col]=true;
                }
            }

            //bottom= row+1,col
            if(row<m-1){
                if(grid[row+1][col]=='1' && visited[row+1][col]==false){
                    q.add(new Pair(row+1,col));
                    visited[row+1][col]=true;
                }
            }

            //left= row,col-1
            if(col>0){
                if(grid[row][col-1]=='1' && visited[row][col-1]==false){
                    q.add(new Pair(row,col-1));
                    visited[row][col-1]=true;
                }
            }

            //right= row,col+1
            if(col<n-1){
                if(grid[row][col+1]=='1' && visited[row][col+1]==false){
                    q.add(new Pair(row,col+1));
                    visited[row][col+1]=true;
                }
            }
        }
    }
}