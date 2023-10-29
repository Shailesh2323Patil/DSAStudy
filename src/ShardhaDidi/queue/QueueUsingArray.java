package ShardhaDidi.queue;

public class QueueUsingArray
{
    public static class Queue
    {
        private int[] arr;
        public int size;
        private int rear;

        public Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        private boolean isEmpty() {
            return rear == -1;
        }

        private boolean isFull() {
            return rear == size-1;
        }

        private void add(int number) {
            if(isFull()) {
                System.out.println("Queue Is Full");
                return;
            }

            arr[++rear] = number;
        }

        private int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int first = arr[0];

            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }

            rear--;

            return first;
        }

        private int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }


        public static void main(String[] args) {
            Queue queue = new Queue(4);

            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.add(7);

            System.out.println(queue.peek());

            for(int i=0; i<queue.size; i++) {
                System.out.println(queue.remove());
            }
        }
    }

}
