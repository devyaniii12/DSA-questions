class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }

        for(int i:freq){
            if(i>0) pq.add(i);
        }
        int time=0;

        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int cycle=n+1;

            while(cycle>0 && !pq.isEmpty()){
                int curr=pq.poll();
                temp.add(curr-1);
                cycle--;
                time++;
            }

            for(int t:temp){
                if(t>0) pq.add(t);
            }

            if(pq.isEmpty()) break;

            time+=cycle;
        }
        return time;
    }
}