class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        // Rotate the queue
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll()); //poll=remove first ele like pop and offer is for pushing ele to end of queue
        }
    }
    public int pop() {
        return q.poll();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}