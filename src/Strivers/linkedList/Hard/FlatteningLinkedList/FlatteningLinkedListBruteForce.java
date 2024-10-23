package Strivers.linkedList.Hard.FlatteningLinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class FlatteningLinkedListBruteForce {

    static class Node {
        int data;
        Node next;
        Node child;

        // Constructors to initialize the
        // data, next, and child pointers
        Node() {
            data = 0;
            next = null;
            child = null;
        }

        Node(int x) {
            data = x;
            next = null;
            child = null;
        }

        Node(int x, Node nextNode, Node childNode) {
            data = x;
            next = nextNode;
            child = childNode;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flattenLinkedList(head);
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
    }

    // Print the linked list by
    // traversing through child pointers
    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print the linked list
    // in a grid-like structure
    static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    static Node flattenLinkedList(Node head) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Node temp = head;

        while (temp != null) {
            Node t2 = temp;

            while (t2 != null) {
                arrayList.add(t2.data);
                t2 = t2.child;
            }

            temp = temp.next;
        }

        Collections.sort(arrayList);

        head = convertArrayListToNode(arrayList);

        return head;
    }

    static Node convertArrayListToNode(ArrayList<Integer> arrayList) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        for (int i = 0; i < arrayList.size(); i++) {
            Node node = new Node(arrayList.get(i));
            res.child = node;
            res = res.child;
        }

        return dummyNode.child;
    }
}
