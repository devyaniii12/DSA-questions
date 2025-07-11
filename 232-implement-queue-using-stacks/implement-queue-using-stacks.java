class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
       st1.push(x); 
    }
    
    public int pop() {
        if(st2.isEmpty()){
            while(st1.size()>0){
            st2.push(st1.pop());
        }}
        return st2.pop();
    }
    
    public int peek() {
        if(st2.isEmpty()){
            while(st1.size()>0){
            st2.push(st1.pop());
        }}
        int x=st2.peek();
        return x;
}

    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();

}}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */