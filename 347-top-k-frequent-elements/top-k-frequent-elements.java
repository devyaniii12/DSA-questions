class Pair{
    int freq;
    int val;
    Pair(int freq,int val){
        this.freq=freq;
        this.val=val;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq)
                return a.freq-b.freq;
                return a.val-b.val;
            }
        );

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int val=entry.getKey();
            int freq=entry.getValue();
            if(pq.size()<k){
                pq.add(new Pair(freq,val));
            }
            else{
                Pair curr=pq.peek();
                if(curr.freq<freq){
                    pq.poll();
                    pq.add(new Pair(freq,val));
                }
            }
        }
        int i=0;
        while(!pq.isEmpty()){
            Pair pp=pq.peek();
            ans[i++]=pp.val;
            pq.poll();
        }
        return ans;
    }
}