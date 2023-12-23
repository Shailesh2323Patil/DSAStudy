package Strivers.stack_queue.Easy.MinStack;

import java.util.Stack;

public class MinStackBruteForce {
    public class Pair {
        int x,y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    Stack<Pair> stack;

    public MinStackBruteForce() {
        stack = new Stack<>();
    }

    public void push(int x) {
        int min;

        if(stack.isEmpty()) {
            min = x;
        }
        else {
            min = Math.min(stack.peek().y, x);
        }

        stack.push(new Pair(x,min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().x;
    }

    public int getMin() {
        return stack.peek().y;
    }

    public static void main(String[] args) {
        MinStackBruteForce st = new MinStackBruteForce();
        st.push(-2); // Push element in stack
        st.push(0); // Push element in stack
        st.push(-3); // Push element in stack
        System.out.println("Min = "+st.getMin()); // Get minimum element from stack -3
        st.pop(); // Pop the topmost element
        System.out.println("Top = "+st.top()); // Top element is 0
        System.out.println("Min = "+st.getMin()); // Minimum element is -2
    }
}
