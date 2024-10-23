package Strivers.linkedList.Learn.SinglyLinkedList;

public class DeleteLinkedList {
    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};
        // Create the linked list with nodes initialized with array values
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        System.out.println("Before Delete :");
        print(head);
        System.out.println();

        head = deleteTail(head);

        System.out.println("After Delete :");
        print(head);
    }

    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }
}
