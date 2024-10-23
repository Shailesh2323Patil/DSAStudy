package Strivers.linkedList.Learn.SinglyLinkedList;

public class SearchElementInLinkedList {
    // Main function
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkIfPresent function and print the result
        System.out.print(checkIfPresent(head, val));
    }

    public static boolean checkIfPresent(Node head, int element) {
        Node temp = head;

        while (head != null) {
            if(head.data == element) {
                return true;
            }

            head = head.next;
        }

        return false;
    }
}
