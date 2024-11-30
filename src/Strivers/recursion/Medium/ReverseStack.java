package Strivers.recursion.Medium;

import java.util.ListIterator;
import java.util.Stack;

public class ReverseStack {
    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext()) {
            lt.next();
        }

        // printing from top to bottom
        while (lt.hasPrevious()) {
            System.out.print(lt.previous() + " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Stack elements before sorting: ");
        printStack(stack);

        reverse(stack);

        System.out.println(" \n\nStack elements after sorting:");
        printStack(stack);
    }

    static void reverse(Stack<Integer> stack)
    {
        if(!stack.isEmpty()) {
            int data = stack.pop();

            reverse(stack);

            stackInsert(stack, data);
        }
    }

    static void stackInsert(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int temp = stack.pop();

        stackInsert(stack, data);

        stack.push(temp);
    }
}
