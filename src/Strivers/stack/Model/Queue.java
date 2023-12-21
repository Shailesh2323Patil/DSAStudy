package Strivers.stack.Model;

public class Queue {
    private int[] arr;
    private int start, end, currSize, maxSize;

    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 16;
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int data) {
        if(currSize == maxSize) {
            System.out.println("Queue is Full\nExiting");
            System.exit(1);
        }
        if(end == -1) {
            start = 0;
            end = 0;
        }
        else {
            end = (end + 1) % maxSize;
        }

        arr[end] = data;
        System.out.println("The element you pushed is : "+data);

        currSize++;
    }

    public int pop() {
        if(currSize == 0) {
            System.out.println("Queue is Empty\nExiting");
            System.exit(1);
        }

        int data = arr[start];
        if(currSize == 1) {
            start = -1;
            end = -1;
        }
        else {
            start = (start + 1) % maxSize;
        }

        currSize--;
        return data;
    }

    public int top() {
        if(currSize == 0) {
            System.out.println("Queue is Empty\nExiting");
            System.exit(1);
        }

        return arr[start];
    }

    public int size() {
        return currSize;
    }
}
