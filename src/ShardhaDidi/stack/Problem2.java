package ShardhaDidi.stack;

import java.util.Stack;

/* Reverse Stack*/
public class Problem2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);

        System.out.println(stack);
    }

    public static void pushItemAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int temp = stack.pop();
        pushItemAtBottom(stack, data);
        stack.push(temp);
    }

    public static void reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        pushItemAtBottom(stack, top);
    }
}
