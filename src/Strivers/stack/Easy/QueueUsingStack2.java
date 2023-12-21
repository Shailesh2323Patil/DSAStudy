package Strivers.stack.Easy;

import java.util.Stack;

public class QueueUsingStack2 {
    public Stack<Integer> input = new Stack<Integer>();
    public Stack<Integer> output = new Stack<Integer>();

    public void push(int data) {
        input.push(data);
        System.out.println("The Element is Pushed "+data);
    }

    public int pop() {
        if(input.empty() && output.empty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        if(output.empty()) {
            while (input.empty() == false) {
                output.push(input.pop());
            }
        }

        int x = output.pop();
        return x;
    }

    public int peek() {
        if(input.empty() && output.empty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        if(output.empty()) {
            while (input.empty() == false) {
                output.push(input.pop());
            }
        }

        int x = output.peek();
        return x;
    }

    public int size() {
        return input.size() + output.size();
    }

    public static void main(String[] args) {
        QueueUsingStack2 q = new QueueUsingStack2();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
