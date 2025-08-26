class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag=0;
        int maxArea=0;

        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            int area=l*b;

            int diag=l*l+b*b;
            if(diag>maxDiag){
                maxDiag=diag;
                maxArea=area;
            }
            else if(diag==maxDiag && area>maxArea){
                maxArea=area;
            }
        }
        return maxArea; 
    }
}