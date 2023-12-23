package Strivers.stack_queue.Easy.MinStack;


import java.util.Stack;

public class MinStackOptimal {
    Stack<Long> stack = new Stack();
    Long mini;

    public MinStackOptimal() {
        mini = Long.MIN_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);

        if(stack.empty()) {
            stack.push(val);
            mini = val;
        }
        else {
            if(val < mini) {
                stack.push(2*val- mini);
                mini = val;
            }
            else {
                stack.push(val);
            }
        }
    }

    public void pop() {
        if(stack.empty()) {
            System.out.println("Stack Empty");
            return;
        }

        long val = stack.pop();

        if(val < mini) {
            mini = 2* mini - val;
        }
    }

    public long top() {
        long val = stack.peek();

        if(val < mini) {
            return mini;
        }
        else {
            return val;
        }
    }

    public long getMini() {
        return mini;
    }

    public static void main(String[] args) {
        MinStackOptimal st = new MinStackOptimal();
        st.push(-2); // Push element in stack
        st.push(0); // Push element in stack
        st.push(-3); // Push element in stack
        System.out.println("Min = "+st.getMini()); // Get minimum element from stack -3
        st.pop(); // Pop the topmost element
        System.out.println("Top = "+st.top()); // Top element is 0
        System.out.println("Min = "+st.getMini()); // Minimum element is -2
    }
}
