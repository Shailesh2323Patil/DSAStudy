package ShardhaDidi.stack;

import java.util.Stack;

/*
* Push Element Bottom Of the Stack
* */
public class Problem1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushItemAtBottom(stack, 4);

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
}
