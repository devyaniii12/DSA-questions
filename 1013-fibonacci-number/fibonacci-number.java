class Solution {
    Map<Integer,Integer> mp=new HashMap<>();
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(mp.containsKey(n)) return mp.get(n);
        int ans=fib(n-1)+fib(n-2);
        mp.put(n,ans);
        return ans;
    }
}