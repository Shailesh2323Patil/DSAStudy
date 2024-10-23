package Strivers.linkedList.Learn.DoublyLinkedList;

public class DeleteDoublyLinkedList {

    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);

        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;

            prev = temp;
        }

        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = temp.back;

        newNode.next = null;
        temp.back = null;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2DLL(arr); // Convert the array to a doubly linked list
        print(head); // Print the doubly linked list

        System.out.println();

        System.out.println("Doubly Linked List after deleting tail node: ");
        head = deleteTail(head);
        print(head);
    }
}
