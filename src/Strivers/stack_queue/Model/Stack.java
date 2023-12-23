package Strivers.stack_queue.Model;

public class Stack {
    int size = 10000;

    int top = -1;
    int[] array = new int[size];

    public void push(int data) {
        top++;
        array[top] = data;
    }

    public int pop() {
        int x = array[top];
        top--;
        return x;
    }

    public int top() {
        return array[top];
    }

    public int size() {
        return top + 1;
    }
}
