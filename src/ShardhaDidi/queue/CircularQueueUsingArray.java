package ShardhaDidi.queue;

public class CircularQueueUsingArray
{
    public static class Queue {
        int[] arr;
        int rear;
        int front;
        int size;

        public Queue(int size) {
            arr = new int[size];
            rear = -1;
            front = -1;
            this.size = size;
        }

        private boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        private boolean isFull() {
            return (rear + 1) % size == front;
        }

        private void add(int data) {
            if(isFull()) {
                System.out.println("Queue Is Full");
                return;
            }

            if(front == -1) {
                front = 0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        private int remove() {
            if(isEmpty()) {
                System.out.println("Remove -> Queue is Empty");
                return -1;
            }

            int first = arr[front];

            if(front == rear) {
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }

            return first;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Peek -> Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        for(int i=0; i<queue.size; i++) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
