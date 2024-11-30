package Strivers.recursion.Medium;

import java.util.*;

public class SortStack {
    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    // Driver code
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack elements before sorting: ");
        printStack(s);

        sortStack(s);

        System.out.println(" \n\nStack elements after sorting:");
        printStack(s);
    }

    private static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            int data = stack.pop();

            sortStack(stack);

            stackInserted(stack, data);
        }
    }

    private static void stackInserted(Stack<Integer> stack, int data) {
        if(stack.isEmpty() || data > stack.peek()) {
            stack.push(data);
            return;
        }

        int temp = stack.pop();
        stackInserted(stack, data);
        stack.push(temp);
    }
}
