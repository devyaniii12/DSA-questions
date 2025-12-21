class Solution {
    public int totalFruit(int[] fruits) {
       int low=0;
        int n=fruits.length;
        int res=-1;
        Map<Integer,Integer> map=new HashMap<>();
        // if(fruits.length<2) return 1;
        // if(fruits.length==2) return 2;
        for(int high=0;high<n;high++){
            int num=fruits[high];
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.size()>2){
                int leftNum=fruits[low];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum)==0) map.remove(leftNum);
                low++;
            }
            // if(map.size()==2){
                res=Math.max(res,high-low+1);
            // }
            
        }
        return res; 
    }
}