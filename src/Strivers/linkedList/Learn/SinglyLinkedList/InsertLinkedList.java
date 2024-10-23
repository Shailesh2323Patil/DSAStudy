package Strivers.linkedList.Learn.SinglyLinkedList;

import java.util.Arrays;
import java.util.List;

public class InsertLinkedList {
    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

       head = insertNode(head, val);

        printNode(head);
    }

    public static Node insertNode(Node head, int data) {
        Node newNode = new Node(data, head);
        return newNode;
    }

    public static void printNode(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
