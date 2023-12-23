package Strivers.stack_queue.Easy.StackSort;

import java.util.Stack;

public class StackSortBruteForce {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(5);

        Stack<Integer> answer = sortStack(stack);

        while (!answer.empty()){
            System.out.print(answer.pop()+"->");
        }
    }

    public static Stack sortStack(Stack<Integer> stack) {
        Stack<Integer> helpStack = new Stack<>();

        while (!stack.empty()) {
            int element = stack.pop();

            while (!helpStack.empty() && helpStack.peek() < element) {
                stack.push(helpStack.pop());
            }

            helpStack.push(element);
        }

        return helpStack;
    }
}
