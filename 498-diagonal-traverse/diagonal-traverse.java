class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[0];
        int m=mat.length;
        int n=mat[0].length;
        int[] diagTraversal=new int[m*n];
        int row=0; 
        int col=0;
        for(int i=0;i<m*n;i++){
            diagTraversal[i]=mat[row][col];
            int sum=row+col;
            if(sum%2==0){
                if(col==n-1) row++;
                else if(row==0) col++;
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==m-1) col++;
                else if(col==0){
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return diagTraversal;      
    }
}