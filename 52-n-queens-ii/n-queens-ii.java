class Solution {
    public int totalNQueens(int n) {
        List<List<String>> st=solveNQueens(n);
        return st.size();
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) {
            Arrays.fill(board[i],'.'); // Initialize board with '.'
        }
        List<List<String>> ans=new ArrayList<>();
        nqueen(board,0,ans);
        return ans;
    }

    void nqueen(char[][] board, int row, List<List<String>> ans) {
        int n=board.length;
        if(row==n) { // If all queens are placed
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++) {
                l.add(new String(board[i])); 
            }
            ans.add(l);
            return;
        }

        for(int col=0;col<n;col++) {
            if(isSafe(board,row,col)) {
                board[row][col]='Q'; // Place queen
                nqueen(board,row+1,ans);
                board[row][col]='.'; // Backtrack
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col) {
        int n=board.length;
        // Check column (upwards)
        for(int i=0;i<row;i++) {
            if(board[i][col]=='Q') return false;
        }

        // Check upper-left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
            if(board[i][j]=='Q') return false;
        }

        // Check upper-right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++) {
            if(board[i][j] =='Q') return false;
        }

        return true;
    }
}
