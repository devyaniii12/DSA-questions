class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }

    boolean helper(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isSafe(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (helper(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int k = 0; k < 9; k++) {
            if (board[row][k] == ch)
                return false;

            if (board[k][col] == ch)
                return false;

            int boxRow = 3 * (row / 3);
            int boxCol = 3 * (col / 3);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[boxRow + i][boxCol + j] == ch)
                        return false;
                }
            }

        }
        return true;
    }
}