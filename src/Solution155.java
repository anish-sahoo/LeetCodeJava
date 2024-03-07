import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(stack.isEmpty()) {
            return;
        }
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        if(minStack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

// https://leetcode.com/problems/min-stack/description/

public class Solution155 {
}