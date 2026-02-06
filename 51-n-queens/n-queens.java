class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        helper(0,n,board);
        return ans;
    }
    void helper(int row,int n,char[][] board){
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,n,board)){
                board[row][col]='Q';
                helper(row+1,n,board);
                board[row][col]='.';
            }
        }
    }
    boolean isSafe(int row,int col,int n,char[][] board){

        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if((i>=0 && j>=0)&& board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(i>=0 && board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    List<String> construct(char[][] board){
        List<String> res=new ArrayList<>();
        for(char[] row:board){
            res.add(new String(row));
        }
        return res;
    }

}