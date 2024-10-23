package Strivers.linkedListDoubly;

import java.util.ArrayList;

public class FindPairInGivenSum {
    public static class Node {
        // Data stored in the node
        public int data;
        // Reference to the next node in the list (forward direction)
        public Node next;
        // Reference to the previous node in the list (backward direction)
        public Node prev;

        // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            prev = back1;
        }

        // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
        public Node(int data1) {
            data = data1;
            next = null;
            prev = null;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from the array and set its 'back' pointer to the previous node
            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the previous node to point to the new node
            prev.next = temp;
            // Move 'prev' to the newly created node for the next iteration
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
            head = head.next; // Move to the next node
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        int target = 6;

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        print(head);

        findPairsWithGivenSum(target, head);
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList();

        Node left = head;
        Node right = head;

        while(right.next != null) {
            right = right.next;
        }

        while(left.data < right.data) {
            if(left.data + right.data == target) {
                ArrayList<Integer> pair = new ArrayList();
                pair.add(left.data);
                pair.add(right.data);

                arrayList.add(pair);

                System.out.println("("+left.data+" "+right.data+")");

                left = left.next;
            }
            else if(left.data + right.data > target) {
                right = right.prev;
            }
            else {
                left = left.next;
            }
        }

        return arrayList;
    }

}
