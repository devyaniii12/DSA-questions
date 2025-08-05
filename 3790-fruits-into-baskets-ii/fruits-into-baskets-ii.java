class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int fruit=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]==0)continue;
                else if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    fruit--;
                    break;
                 }
            }
        }
        return fruit;
        }
    }