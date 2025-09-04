class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1=0,diff2=0;
        if(x<z) diff1=z-x;
        else diff1=x-z;

        if(y<z) diff2=z-y;
        else diff2=y-z;
    
    if(diff1<diff2){
        return 1;
    }
    else if(diff2<diff1){
        return 2;
    }
    return 0;
    }
}