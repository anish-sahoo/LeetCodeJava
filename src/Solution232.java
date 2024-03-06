import java.util.ArrayDeque;

class MyQueue {
    ArrayDeque<Integer> queue;
    ArrayDeque<Integer> dumpStack;
    int length;

    public MyQueue() {
        queue = new ArrayDeque<>();
        dumpStack = new ArrayDeque<>();
        length = 0;
    }
    
    public void push(int x) {
        while (!queue.isEmpty()) {
            dumpStack.push(queue.pop());
        }
        queue.push(x);
        while (!dumpStack.isEmpty()) {
            queue.push(dumpStack.pop());
        }
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class Solution232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println("obj.pop(): " + obj.pop());
    }
}

// https://leetcode.com/problems/implement-queue-using-stacks/description/