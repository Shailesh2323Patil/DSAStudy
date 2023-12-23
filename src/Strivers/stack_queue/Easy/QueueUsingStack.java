package Strivers.stack_queue.Easy;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> input = new Stack<Integer>();
    private Stack<Integer> output = new Stack<Integer>();

    public void push(int data) {
        while (input.empty() == false) {
            output.push(input.pop());
        }

        System.out.println("The element pushed is " + data);
        input.push(data);

        while (output.empty() == false) {
            input.push(output.pop());
        }
    }

    public int pop() {
        if(input.empty() == true) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        int val = input.pop();
        return val;
    }

    public int peek() {
        if(input.empty() == true) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        int val = input.peek();
        return val;
    }

    public int size() {
        return input.size();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
