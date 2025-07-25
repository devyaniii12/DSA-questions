class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       int i=0;
        int j=matrix[0].length-1;
        while((i>=0 && i<m)&& (j>=0 && j<n)){
            if(matrix[i][j]==target){
                return true;
            }
            else if(target<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    } 
}
    
