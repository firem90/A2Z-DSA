class MyQueue {

    Stack<Integer> s;
    List<Integer> l;
    public MyQueue() {
        this.s = new Stack<>();
        this.l = new ArrayList<>();
    }
    
    public void push(int x) {
        this.s.push(x);
        this.l.add(x);
    }
    
    public int pop() {
        int r = this.l.get(0);
        this.l.remove(0);
        return r;
    }
    
    public int peek() {
        return this.l.get(0);
    }
    
    public boolean empty() {
        return this.l.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */