package ShardhaDidi.queue;

import java.util.Stack;

public class QueueUsing2Stacks {

    public static class Queue {
        public Stack<Integer> stack1 = new Stack<Integer>();
        public Stack<Integer> stack2 = new Stack<Integer>();

        private void add(int data) {
            while (!stack1.isEmpty()) {
                int num = stack1.pop();
                stack2.push(num);
            }

            stack1.push(data);

            while (!stack2.isEmpty()) {
                int num = stack2.pop();
                stack1.push(num);
            }
        }

        private boolean isEmpty() {
            return stack1.isEmpty();
        }

        private int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return stack1.pop();
        }

        private int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        //java.util.Queue queue = new ArrayDeque<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.remove();

        System.out.println("Peak First Element : "+queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
