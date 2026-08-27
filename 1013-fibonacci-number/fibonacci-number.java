class Solution {
    public int fib(int n) {
        Map<Integer,Integer> mp=new HashMap<>();
        if(n<=1){
            mp.put(n,n);
            return n;
        }
        if(mp.containsKey(n)) return mp.get(n);
        return fib(n-1)+fib(n-2);
    }
}