package Strivers.linkedList.Hard.CloneLinkedListWithRandomAndNextPointer;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedListWithRandomAndNextPointerBruteForce {
    // Node class to represent
    // elements in the linked list
    static class Node {
        // Data stored in the node
        int data;
        // Pointer to the next node
        Node next;
        // Pointer to a random node in the list
        Node random;

        // Constructors for Node class
        Node() {
            this.data = 0;
            this.next = null;
            this.random = null;
        }

        Node(int x) {
            this.data = x;
            this.next = null;
            this.random = null;
        }

        Node(int x, Node nextNode, Node randomNode) {
            this.data = x;
            this.next = nextNode;
            this.random = randomNode;
        }
    }

    // Function to print the cloned linked list
    public static void printClonedLinkedList(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }

    static Node cloneLL(Node head) {
        Node temp = head;

        Map<Node, Node> map = new HashMap<>();

        while (temp != null) {
            Node newNode = new Node(temp.data);
            map.put(temp, newNode);

            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            Node copyNode = map.get(temp);

            copyNode.next = map.getOrDefault(temp.next, null);

            copyNode.random = map.getOrDefault(temp.random, null);

            temp = temp.next;
        }

        return map.get(head);
    }

    // Main function
    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        // Clone the linked list
        Node clonedList = cloneLL(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }

}
