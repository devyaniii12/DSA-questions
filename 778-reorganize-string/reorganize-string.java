class Pair{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
       Map<Character,Integer> mp=new HashMap<>();
       for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
                return b.freq-a.freq;
            }
        ) ;

        for(char c:mp.keySet()){
            pq.add(new Pair(c,mp.get(c)));
        }

        StringBuilder ans=new StringBuilder();
        while(pq.size()>1){
            Pair first=pq.poll();
            Pair second=pq.poll();

            ans.append(first.ch);
            ans.append(second.ch);

            first.freq--;
            second.freq--;

            if(first.freq>0) pq.add(first);
            if(second.freq>0) pq.add(second);
        }
            if(!pq.isEmpty()){
                Pair last=pq.poll();
                if(last.freq>1) return "";

                ans.append(last.ch);
            }
        return ans.toString();
    }
}