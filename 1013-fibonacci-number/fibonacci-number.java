class Solution {
    Map<Integer,Integer> mp=new HashMap<>();
    public int fib(int n) {
        if(n<=1){
            mp.put(n,n);
            return n;
        }
        if(mp.containsKey(n)) return mp.get(n);
        return fib(n-1)+fib(n-2);
    }
}