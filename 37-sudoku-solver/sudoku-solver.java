class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    // Try placing digits '1' to '9'
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(board, i, j, k)) {
                            board[i][j] = k;

                            // Recursively solve the rest of the board
                            if (solve(board)) {
                                return true;
                            } else {
                                // Undo the move if it leads to a dead end
                                board[i][j] = '.';
                            }
                        }
                    }
                    // If no digit can be placed in this cell, return false
                    return false;
                }
            }
        }
        // If the entire board is filled, return true
        return true;
    }

    boolean isValid(char[][] board, int row, int col, char k) {
        // Check if 'k' is valid in the row, column, and 3x3 grid
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == k || board[c][col] == k || 
                board[3 * (row / 3) + c / 3][3 * (col / 3) + c % 3] == k) {
                return false;
            }
        }
        return true;
    }
}
