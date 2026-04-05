class MinStack {
    private Deque<Integer> innerStack;
    private Deque<Integer> minimums;

    public MinStack() {
        innerStack = new ArrayDeque<>();
        minimums = new ArrayDeque<>();
    }
    
    public void push(int val) {
        innerStack.push(val);
        if(minimums.isEmpty()) {
            minimums.push(val);
        } else {
            minimums.push(Math.min(minimums.peek(), val));
        }
    }
    
    public void pop() {
        innerStack.pop();
        minimums.pop();
    }
    
    public int top() {
        return innerStack.peek();
    }
    
    public int getMin() {
        return minimums.peek();
    }
}
