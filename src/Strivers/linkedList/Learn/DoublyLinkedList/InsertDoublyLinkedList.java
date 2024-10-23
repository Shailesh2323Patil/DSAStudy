package Strivers.linkedList.Learn.DoublyLinkedList;

public class InsertDoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println();

        System.out.println("Doubly Linked List After Inserting At Tail:");

        head = insertAtTail(head, 10); // Insert a node with value 10 at the end
        print(head);
    }


    public static Node insertAtTail(Node head, int data) {
        if(head != null) {
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(data, null, temp);
        temp.next = newNode;

        return head;
    }

    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }


}
