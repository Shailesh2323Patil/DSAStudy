package Strivers.linkedList.Medium.ReverseDoublyLL;

import Strivers.linkedList.Learn.DoublyLinkedList.Node;
import Strivers.stack_queue.Model.Stack;

public class ReverseDoublyLLOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("Doubly Linked List After Reversing :");

        head = reverseDLL(head);
        print(head);
    }

    private static Node reverseDLL(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            prev = current.back;

            current.back = current.next;
            current.next = prev;

            current = current.back;
        }

        return prev.back;
    }


    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the
        //first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from
            // the array and set its 'back' pointer
            // to the previous node

            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the
            // previous node to point to the new node

            prev.next = temp;
            // Move 'prev' to the newly created node
            //for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next;
        }
        System.out.println();
    }


}
