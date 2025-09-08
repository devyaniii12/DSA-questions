class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int j=n-i;
            if(noZero(i) && noZero(j)) return new int[]{i,j};
        }
        return new int[]{-1,-1};
    }
    boolean noZero(int a){
        while(a>0){
            if(a%10==0) return false;
        a=a/10;
        }
        return true;   
    }
}